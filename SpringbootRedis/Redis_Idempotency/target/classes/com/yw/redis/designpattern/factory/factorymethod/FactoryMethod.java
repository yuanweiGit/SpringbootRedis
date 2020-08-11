package com.yw.redis.designpattern.factory.factorymethod;


import com.yw.redis.designpattern.factory.IPay;

public interface FactoryMethod {

    IPay createPay(String payType);

}
