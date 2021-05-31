package com.weidd.best.study.service;

import com.weidd.best.study.pojo.User;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-29 15:50
 **/
public interface UserService {
    void save(User user);
    User queryUserByName(String name);
    User queryUserById(long id);
}
