package com.github;

import com.github.singleton.Logger1;

public class Main {
    public static void main(String[] args) {
        Logger1 logger1 = Logger1.getInstance();

        logger1.log("Hello, World!");

        Logger1 logger2 = Logger1.getInstance();

        logger2.log("Hello, World! 2");

        System.out.println(logger1 == logger2);
    }
}
