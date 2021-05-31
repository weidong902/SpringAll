package com.weidd.best.study.service;

import com.weidd.best.study.pojo.User;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 19:33
 **/
public interface UserService {

    void save(User user);
    public User findUser(int id);
}
