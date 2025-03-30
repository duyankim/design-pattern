package com.github.factoryMethod;

import java.util.Map;

public class MessageTemplateService {

    private final MessageTemplateRepository messageTemplateRepository;

    public MessageTemplateService(MessageTemplateRepository messageTemplateRepository) {
        this.messageTemplateRepository = messageTemplateRepository;
    }

    public String buildMessage(String templateId, Map<String, Object> params) {
        String template = messageTemplateRepository.findById(templateId)
                .orElseThrow(() -> new IllegalArgumentException("해당 템플릿이 존재하지 않습니다."));

        return replaceParams(template, params);
    }

    private String replaceParams(String template, Map<String, Object> params) {
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            template = template.replace("{{" + entry.getKey() + "}}", entry.getValue().toString());
        }

        return template;
    }
}
