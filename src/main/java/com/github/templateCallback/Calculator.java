package com.github.templateCallback;

public class Calculator {

    public int silverMemberDiscount(int price) {
        DiscountCallback silverMemberDiscountPolicy = new DiscountCallback() {
            @Override
            public int calculateDiscount(int price) {
                return (int) (price * 0.1);
            }
        };
        return calculateWithDiscount(price, silverMemberDiscountPolicy);
    }

    public int goldMemberDiscount(int price) {
        DiscountCallback goldMemberDiscountPolicy = new DiscountCallback() {
            @Override
            public int calculateDiscount(int price) {
                return (int) (price * 0.2);
            }
        };
        return calculateWithDiscount(price, goldMemberDiscountPolicy);
    }

    private int calculateWithDiscount(int price, DiscountCallback callback) {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        return discountCalculator.applyDiscount(price, callback);
    }
}
