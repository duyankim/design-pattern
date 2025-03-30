package com.github.adapter;

/**
 * 도메인 서비스 : 송금 처리 후 알림 발행
 */
public class TransferService {

    private final NotificationPort notificationPort;

    public TransferService(NotificationPort notificationPort) {
        this.notificationPort = notificationPort;
    }

    public void completeTransfer(String senderId, String receiverId, int amount) {
        // 송금 처리 비즈니스 로직
        // 생략

        String transferId = "transfer-id-1234"; // 채번 로직 추가

        // 송금 완료 알림 발행
        notificationPort.send(new TransferCompletedNotificationDto(transferId, receiverId, amount));
    }
}
