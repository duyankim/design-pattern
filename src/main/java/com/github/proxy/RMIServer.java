package com.github.proxy;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {

    public static void main(String[] args) {
        try {
            PaymentService paymentService = new PaymentServiceImpl();
            Registry registry = LocateRegistry.createRegistry(1099); // RMI 레지스트리 생성
            registry.rebind("rmi://localhost:1099/paymentService", paymentService);
            System.out.println("PaymentService bound in registry");
        } catch (Exception e) {
            System.err.println("PaymentService exception:");
            e.printStackTrace();
        }
    }
}
