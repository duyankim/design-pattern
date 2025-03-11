package com.github.strategy;

import java.math.BigDecimal;

public class SendMoneyPayment implements PaymentStrategy {
    
    @Override
    public boolean pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " using Send Money");
        return true;
    }
}
