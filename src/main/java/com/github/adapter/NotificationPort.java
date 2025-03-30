package com.github.adapter;

/**
 * 출력 포트
 */
public interface NotificationPort {

    void send(TransferCompletedNotificationDto notification);
}
