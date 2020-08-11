package com.yw.redis.designpattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class AliPayStrategy implements PayStrategy {

    @Override
    public void pay(String userId) {
        System.out.println("AliPayStrategy userId: " + userId);
    }

}
