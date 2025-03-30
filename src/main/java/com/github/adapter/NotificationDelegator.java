package com.github.adapter;

/**
 * 출력 포트를 결정하는 클래스. 프로덕션 환경에서는 카프카 어댑터를 사용하고, 그 외 환경에서는 슬랙 어댑터를 사용한다.
 */
public class NotificationDelegator implements NotificationPort {

    private final NotificationPort kafkaAdapter;
    private final NotificationPort slackAdapter;

    public NotificationDelegator(NotificationPort kafkaAdapter, NotificationPort slackAdapter) {
        this.kafkaAdapter = kafkaAdapter;
        this.slackAdapter = slackAdapter;
    }

    @Override
    public void send(TransferCompletedNotificationDto notification) {
        if (isProduction()) {
            kafkaAdapter.send(notification);
        } else {
            slackAdapter.send(notification);
        }
    }

    private boolean isProduction() {
        return "prod".equals(System.getProperty("ENV"));
    }
}
