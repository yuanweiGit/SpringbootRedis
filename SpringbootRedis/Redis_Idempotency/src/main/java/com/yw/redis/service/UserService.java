package com.yw.redis.service;


import com.yw.redis.common.ServerResponse;
import com.yw.redis.pojo.User;

import java.util.List;


public interface UserService {

    List<User> getAll();

    User getOne(Integer id);

    void add(User user);

    void update(User user);

    void delete(Integer id);

    User getByUsernameAndPassword(String username, String password);

    ServerResponse login(String username, String password);

    void batchInsert(List<User> list);

    void batchUpdate(List<User> list);

}
