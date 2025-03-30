package com.github.factoryMethod;

import java.util.Optional;

public interface MessageTemplateRepository {
    Optional<String> findById(String templateId);
}
