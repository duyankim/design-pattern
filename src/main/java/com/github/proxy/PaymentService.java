package com.github.proxy;

import java.math.BigDecimal;
import java.rmi.Remote; // maker interface
import java.rmi.RemoteException;

public interface PaymentService extends Remote {
    // Remote는 메소드가 없지만, 반드시 확장해야 한다.

    /*
     인자와 리턴값은 반드시 primitive 또는 Serializable 형식으로 선언
     원격 메소드의 인자와 리턴값은 네트워크로 전달되어야 하고, 직렬화로 포장되기 때문
     */
    String processPayment(String amount) throws RemoteException;
    // 모든 원격 메소드 호출은 위험이 따르는 것으로 간주해야 한다.
    // 모든 메소드에서 RemoteException을 선언하면 클라이언트에서 예외 상황 발생을 대비할 수 있다.
}
