package com.github.proxy;

import java.rmi.Naming;

public class RMIClient {

    public static void main(String[] args) {
        try {
            PaymentService paymentService = (PaymentService) Naming.lookup("rmi://localhost:1099/paymentService");
            System.out.println(paymentService.processPayment("10000.00"));
        } catch (Exception e) {
            System.err.println("PaymentService exception:");
            e.printStackTrace();
        }
    }
}
