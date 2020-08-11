package com.yw.redis.mq.consumer;

import com.rabbitmq.client.Channel;

import com.yw.redis.mq.BaseConsumer;
import com.yw.redis.mq.MessageHelper;
import com.yw.redis.pojo.LoginLog;
import com.yw.redis.service.LoginLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoginLogConsumer implements BaseConsumer {

    @Autowired
    private LoginLogService loginLogService;

    @Override
    public void consume(Message message, Channel channel) {
        log.info("收到消息: {}", message.toString());
        LoginLog loginLog = MessageHelper.msgToObj(message, LoginLog.class);
        loginLogService.insert(loginLog);
    }
}
