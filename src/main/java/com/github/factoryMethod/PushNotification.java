package com.github.factoryMethod;

import java.util.Map;

@NotificationPolicy(NotificationType.PUSH)
public class PushNotification implements Notification {

    private final MessageTemplateService messageTemplateService;

    public PushNotification(MessageTemplateService messageTemplateService) {
        this.messageTemplateService = messageTemplateService;
    }

    @Override
    public void send(String templateId, Map<String, Object> params) {
        // push알람을 보내는 코드
        String message = messageTemplateService.buildMessage(templateId, params);
        System.out.println("Push sent: " + message);
    }
}
