package com.github.decorator;

public class BlackFridayDiscountDecorator extends CartDecorator {

    private double discountRate;

    public BlackFridayDiscountDecorator(Cart decoratedCart, double discountRate) {
        super(decoratedCart);
        this.discountRate = discountRate;
    }

    @Override
    public String getDescription() {
        return decoratedCart.getDescription() + " + 블랙 프라이데이 할인";
    }

    @Override
    public void addItem(Item product) {
        decoratedCart.addItem(product);
    }

    @Override
    public Double getTotalPrice() {
        return super.getTotalPrice() * (1 - discountRate);
    }
}
