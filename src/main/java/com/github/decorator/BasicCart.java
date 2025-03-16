package com.github.decorator;

import java.math.BigDecimal;

public class BasicCart implements Cart{

    private final Items items;
    private Double totalPrice;

    public BasicCart(Items items, Double totalPrice) {
        this.items = items;
        this.totalPrice = totalPrice;
    }

    @Override
    public Double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String getDescription() {
        return "기본 장바구니";
    }

    @Override
    public void addItem(Item product) {
        items.add(product);
        totalPrice = items.getTotalPrice();
    }
}
