package com.yw.redis.service;

import com.yw.redis.common.ServerResponse;

import javax.servlet.http.HttpServletRequest;

public interface TokenService {
    ServerResponse createToken();

    void checkToken(HttpServletRequest request);
}
