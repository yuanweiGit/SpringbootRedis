package com.yw.redis.designpattern.factory.factorymethod;


import com.yw.redis.designpattern.factory.IPay;

public class AFactory implements FactoryMethod {

    @Override
    public IPay createPay(String payType) {
        return null;
    }

}
