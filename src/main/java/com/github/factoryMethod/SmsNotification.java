package com.github.factoryMethod;

import java.util.Map;

@NotificationPolicy(NotificationType.SMS)
public class SmsNotification implements Notification {

    private final MessageTemplateService messageTemplateService;

    public SmsNotification(MessageTemplateService messageTemplateService) {
        this.messageTemplateService = messageTemplateService;
    }

    @Override
    public void send(String templateId, Map<String, Object> params) {
        // 문자를 보내는 코드
        String message = messageTemplateService.buildMessage(templateId, params);
        System.out.println("SMS sent: " + message);
    }
}
