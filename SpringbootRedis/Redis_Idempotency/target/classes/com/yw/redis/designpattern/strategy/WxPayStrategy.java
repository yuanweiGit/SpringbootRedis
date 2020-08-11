package com.yw.redis.designpattern.strategy;

public class WxPayStrategy implements PayStrategy {

    @Override
    public void pay(String userId) {
        System.out.println("WxPayStrategy userId: " + userId);
    }

}
