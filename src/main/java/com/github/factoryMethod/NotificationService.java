package com.github.factoryMethod;

import java.util.Map;

public class NotificationService {

    private final NotificationFactory notificationFactory;

    public NotificationService(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public void sendNotification(NotificationType type, String templateId, Map<String, Object> params) {
        Notification notification = notificationFactory.getByType(type);
        notification.send(templateId, params);
    }
}
