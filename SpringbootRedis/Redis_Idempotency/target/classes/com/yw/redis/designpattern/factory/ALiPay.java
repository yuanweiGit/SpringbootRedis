package com.yw.redis.designpattern.factory;

public class ALiPay implements IPay{

    @Override
    public boolean pay() {
        // 支付相关逻辑...
        return true;
    }

}
