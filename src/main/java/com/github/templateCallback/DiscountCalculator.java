package com.github.templateCallback;

public class DiscountCalculator {

    public int applyDiscount(int price, DiscountCallback callback) {
        int discount = callback.calculateDiscount(price); // 할인액
        return price - discount; // 정가 - 할인액
    }
}
