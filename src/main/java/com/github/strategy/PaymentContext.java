package com.github.strategy;

import java.math.BigDecimal;

public class PaymentContext {
    
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(BigDecimal amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy is undefined");
        }
        paymentStrategy.pay(amount);
    }
}
