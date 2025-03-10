package com.github.singleton;

/**
 * 싱글톤 패턴 3) 더블 체크 락
 */
public class Logger3 {
    private volatile static Logger3 uniqueInstance;

    private Logger3() {}

    public static Logger3 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Logger3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Logger3();
                }
            }
        }
        return uniqueInstance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
