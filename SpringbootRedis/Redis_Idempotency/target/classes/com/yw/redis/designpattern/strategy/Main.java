package com.yw.redis.designpattern.strategy;

public class Main {

    public static void main(String[] args) {
        PayContext payContext = new PayContext();
        payContext.pay("3", "aaa");
    }

}
