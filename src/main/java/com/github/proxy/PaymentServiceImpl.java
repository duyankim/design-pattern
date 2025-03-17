package com.github.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PaymentServiceImpl extends UnicastRemoteObject implements PaymentService {
    // 원격서비스 객체 역할을 하려면 객체에 '원격객체'기능을 추가해야 한다.
    // 가장 간단한 방법은 UnicaseRemoteObject를 상속받는 것이다.

    private static final long serialVersionUID = 1L;
    // UnicastRemoteObject를 상속받는 클래스는 반드시 serialVersionUID를 선언해야 한다.
    // Serializable을 구현하기 때믄이다.

    public PaymentServiceImpl() throws RemoteException {
        // 슈퍼클래스 생성자가 어떤 예외를 던진다면 서브클래스의 생성자도 그 예외를 선언해야 한다.
    }

    @Override
    public String processPayment(String amount) {
        return "Payment processed for amount: " + amount;
    }
}
