package com.github.decorator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Items {

    private final List<Item> items;

    public Items() {
        this.items = new ArrayList<>();
    }

    public Items(final List<Item> items) {
        this.items = items;
    }

    public void add(Item product) {
        items.add(product);
    }

    public List<Item> getItems() {
        return items;
    }

    public Double getTotalPrice() {
        return items.stream()
                .map(Item::getPrice)
                .reduce(Double.valueOf(0), Double::sum);
    }
}
