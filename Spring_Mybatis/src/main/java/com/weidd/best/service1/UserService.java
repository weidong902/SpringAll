package com.weidd.best.service1;

import com.weidd.best.pojo.User;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 19:33
 **/
public interface UserService {

    void save(User user);
    public User findUser(int id);
}
