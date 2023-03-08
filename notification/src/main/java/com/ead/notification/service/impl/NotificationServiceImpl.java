package com.ead.notification.service.impl;

import com.ead.notification.enums.NotificationStatus;
import com.ead.notification.models.NotificationModel;
import com.ead.notification.repositories.NotificationRepository;
import com.ead.notification.service.NotificationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class NotificationServiceImpl implements NotificationService {

    final NotificationRepository notificationsRepository;

    public NotificationServiceImpl(NotificationRepository notificationsRepository) {
        this.notificationsRepository = notificationsRepository;
    }


    @Override
    public NotificationModel saveNotification(NotificationModel notificationModel) {
        return notificationsRepository.save(notificationModel);

    }

    @Override
    public Page<NotificationModel> findAllNotificationsByUser(UUID userId, Pageable pageable) {
        return notificationsRepository.findAllByUserIdAndNotificationStatus(userId, NotificationStatus.CREATED, null);

    }
}
