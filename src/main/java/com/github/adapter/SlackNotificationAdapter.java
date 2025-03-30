package com.github.adapter;

/**
 * 아웃바운드 어댑터 : slack 알림 전송
 */
public class SlackNotificationAdapter implements NotificationPort {

    @Override
    public void send(TransferCompletedNotificationDto notification) {
        // slack 전송 로직
        System.out.printf("[Slack] %s님에게 %d원을 송금했습니다 (송금 ID: %s)\n",
                notification.receiverId(),
                notification.amount(),
                notification.transferId());
    }
}
