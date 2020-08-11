package com.yw.redis.service;


import com.yw.redis.pojo.LoginLog;

public interface LoginLogService {

    void insert(LoginLog loginLog);

    LoginLog selectByMsgId(String msgId);

}
