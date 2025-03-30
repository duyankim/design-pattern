package com.github.factoryMethod;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NotificationFactory {

    private final Map<NotificationType, Notification> strategies;

    public NotificationFactory(List<Notification> notifications) {
        this.strategies = notifications.stream()
                .collect(Collectors.toMap(this::resolveType, Function.identity()));
    }

    public Notification getByType(NotificationType type) {
        return strategies.get(type);
    }

    private NotificationType resolveType(Notification notification) {
        NotificationPolicy annotation = notification.getClass().getAnnotation(NotificationPolicy.class);
        if (annotation == null) {
            throw new RuntimeException("Notification class에 @NotificationPolicy가 없습니다: " + notification.getClass());
        }
        return annotation.value();
    }
}
