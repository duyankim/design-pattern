package com.github.strategy;

import java.math.BigDecimal;

public class CreditCardPayment implements PaymentStrategy {
    
    @Override
    public boolean pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        return true;
    }
}
