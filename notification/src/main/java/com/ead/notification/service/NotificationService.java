package com.ead.notification.service;

import com.ead.notification.models.NotificationModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface NotificationService {
    NotificationModel saveNotification(NotificationModel notificationModel);

    Page<NotificationModel> findAllNotificationsByUser(UUID userId, Pageable pageable);
}
