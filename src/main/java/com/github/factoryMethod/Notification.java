package com.github.factoryMethod;

import java.util.Map;

public interface Notification {
    void send(String templateId, Map<String, Object> params);
}
