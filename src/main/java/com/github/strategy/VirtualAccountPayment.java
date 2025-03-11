package com.github.strategy;

import java.math.BigDecimal;

public class VirtualAccountPayment implements PaymentStrategy {
    
    @Override
    public boolean pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " using Virtual Account");
        return true;
    }
}
