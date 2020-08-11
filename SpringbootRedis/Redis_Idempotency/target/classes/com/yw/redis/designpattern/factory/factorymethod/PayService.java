package com.yw.redis.designpattern.factory.factorymethod;


import com.yw.redis.designpattern.factory.IPay;

public class PayService {

    public void pay(String payType) {
        FactoryMethod aFactory = new AFactory();
        IPay pay = aFactory.createPay(payType);

    }

}
