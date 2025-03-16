package com.github.decorator;

import java.math.BigDecimal;

public abstract class CartDecorator implements Cart{

    protected Cart decoratedCart;

    public CartDecorator(Cart decoratedCart){
        this.decoratedCart = decoratedCart;
    }

    @Override
    public Double getTotalPrice() {
        return decoratedCart.getTotalPrice();
    }

    @Override
    public String getDescription() {
        return decoratedCart.getDescription();
    }

    @Override
    public void addItem(Item product) {
        decoratedCart.addItem(product);
    }
}
