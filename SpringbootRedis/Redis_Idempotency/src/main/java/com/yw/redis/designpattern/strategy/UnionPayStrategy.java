package com.yw.redis.designpattern.strategy;

public class UnionPayStrategy implements PayStrategy {

    @Override
    public void pay(String userId) {
        System.out.println("UnionPayStrategy userId: " + userId);
    }

}
