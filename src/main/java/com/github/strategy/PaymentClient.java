package com.github.strategy;

import java.math.BigDecimal;

public class PaymentClient {
    
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        
        // 계좌이체
        context.setPaymentStrategy(new SendMoneyPayment());
        context.executePayment(BigDecimal.valueOf(50000));
        
        // 카드결제
        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(BigDecimal.valueOf(50000));
        
        // 가상계좌
        context.setPaymentStrategy(new VirtualAccountPayment());
        context.executePayment(BigDecimal.valueOf(50000));
        
        // 네이버페이
        context.setPaymentStrategy(new NaverpayPayment());
        context.executePayment(BigDecimal.valueOf(50000));
    }
}
