package com.yw.redis.mapper;


import com.yw.redis.pojo.LoginLog;

public interface LoginLogMapper {

    void insert(LoginLog loginLog);

    LoginLog selectByMsgId(String msgId);

}
