package com.github.decorator;


public class Item {

    private final String name;
    private final Double price;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
