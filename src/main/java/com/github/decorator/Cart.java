package com.github.decorator;

import java.math.BigDecimal;

public interface Cart {

    Double getTotalPrice();
    String getDescription();
    void addItem(Item product);
}
