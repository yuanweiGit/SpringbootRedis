package com.yw.redis.designpattern.strategy;



import com.yw.redis.designpattern.factory.PayTypeEnum;
import com.yw.redis.exception.ServiceException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//@Component
public class PayContext {

//    @Autowired
//    private Map<String, PayStrategy> map;

    private static Map<String, PayStrategy> map2 = new ConcurrentHashMap<>();
    static {
        map2.put(PayTypeEnum.ALI_PAY.getCode(), new AliPayStrategy());
        map2.put(PayTypeEnum.WE_CHAT_PAY.getCode(), new WxPayStrategy());
        map2.put(PayTypeEnum.UNION_PAY.getCode(), new UnionPayStrategy());
    }

    public void pay(String payType, String userId) {
        PayStrategy payStrategy = map2.get(payType);
        if (null == payStrategy) {
            throw new ServiceException("payType: " + payType + " not supported");
        }

        payStrategy.pay(userId);
    }

}
