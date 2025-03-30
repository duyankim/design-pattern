package com.github.factoryMethod;

import java.util.Map;

@NotificationPolicy(NotificationType.EMAIL)
public class EmailNotification implements Notification {

    private final MessageTemplateService messageTemplateService;

    public EmailNotification(MessageTemplateService messageTemplateService) {
        this.messageTemplateService = messageTemplateService;
    }

    @Override
    public void send(String templateId, Map<String, Object> params) {
        // 이메일을 보내는 코드
        String message = messageTemplateService.buildMessage(templateId, params);
        System.out.println("Email sent: " + message);
    }
}
