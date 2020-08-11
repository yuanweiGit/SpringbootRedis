package com.yw.redis.designpattern.factory.simplefactory;


import com.yw.redis.designpattern.factory.IPay;
import com.yw.redis.exception.ServiceException;
import org.apache.commons.lang3.StringUtils;

public class PayService {

    public void pay(String payType) {
        if (StringUtils.isBlank(payType)) {
            throw new ServiceException("支付方式异常");
        }

        boolean isPaySuccess = isPaySuccess(payType);
        if (isPaySuccess) {
            // 巴拉巴拉
        } else {
            // 巴拉巴拉
        }
    }

    private boolean isPaySuccess(String payType) {
        IPay iPay = PayFactory.createPay(payType);
        if (null == iPay) {
            throw new ServiceException("支付方式异常");
        }

        return iPay.pay();
    }

}
