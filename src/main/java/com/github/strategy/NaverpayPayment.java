package com.github.strategy;

import java.math.BigDecimal;

public class NaverpayPayment implements PaymentStrategy {
    
    @Override
    public boolean pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " using Naverpay");
        return true;
    }
}
