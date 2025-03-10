package com.github.singleton;

/**
 * 싱글톤 패턴 5) LazyHolder
 */
public class Logger5 {
    private Logger5() {}

    public static Logger5 getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final Logger5 INSTANCE = new Logger5();
    }
}
