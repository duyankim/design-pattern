package com.github.singleton;

/**
 * 싱글톤 패턴 1) 게으른 인스턴스 생성
 */
public class Logger1 {
    private static Logger1 uniqueInstance;

    private Logger1() {}

    public static Logger1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Logger1();
        }
        return uniqueInstance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
