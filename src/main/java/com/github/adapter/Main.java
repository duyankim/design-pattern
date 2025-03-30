package com.github.adapter;

public class Main {
    public static void main(String[] args) {
        System.setProperty("ENV", "dev");

        KafkaProducer kafkaProducer = new KafkaProducer();
        NotificationPort kafka = new KafkaNotificationAdapter(kafkaProducer);
        NotificationPort slack = new SlackNotificationAdapter();

        NotificationPort delegator = new NotificationDelegator(kafka, slack);
        TransferService transferService = new TransferService(delegator);
        TransferController controller = new TransferController(transferService);

        // 실제 요청처럼 DTO 만들어 호출
        TransferRequestDto request = new TransferRequestDto("KIM001", "LEE001", 50000);
        controller.transfer(request);
    }
}
