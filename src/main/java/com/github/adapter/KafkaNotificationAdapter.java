package com.github.adapter;

/**
 * 아웃바운드 어댑터 : Kafka 알림 전송
 */
public class KafkaNotificationAdapter implements NotificationPort {

    private final KafkaProducer kafkaProducer;

    public KafkaNotificationAdapter(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @Override
    public void send(TransferCompletedNotificationDto notification) {
        String message = String.format("%s님에게 %d원을 송금했습니다 (송금 ID: %s)\n",
                notification.receiverId(),
                notification.amount(),
                notification.transferId());

        // Kafka 전송 로직
        kafkaProducer.send("transfer-completed", message);
    }
}
