package com.github.decorator;

public class FreeShippingDecorator extends CartDecorator{

    private static final Double DEFAULT_SHIPPING_COST = 3000.0;

    public FreeShippingDecorator(Cart decoratedCart) {
        super(decoratedCart);
    }

    @Override
    public void addItem(Item product) {
        super.addItem(product);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public Double getTotalPrice() {
        return super.getTotalPrice() - DEFAULT_SHIPPING_COST;
    }
}
