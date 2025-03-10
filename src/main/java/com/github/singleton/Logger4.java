package com.github.singleton;

/**
 * 싱글톤 패턴 4) ENUM 사용
 */
public enum Logger4 {
    UNIQUE_INSTANCE;

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
