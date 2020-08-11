package com.yw.redis.service;


import com.yw.redis.common.ServerResponse;
import com.yw.redis.pojo.Mail;

public interface TestService {

    ServerResponse testIdempotence();

    ServerResponse accessLimit();

    ServerResponse send(Mail mail);
}
