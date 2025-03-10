package com.github.singleton;

/**
 * 싱글톤 패턴 2) 멀티스레드 환경에서 동기화
 */
public class Logger2 {
    private static Logger2 uniqueInstance;

    private Logger2() {}

    public static synchronized Logger2 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Logger2();
        }
        return uniqueInstance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
