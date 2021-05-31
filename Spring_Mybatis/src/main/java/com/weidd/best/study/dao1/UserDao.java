package com.weidd.best.study.dao1;

import com.weidd.best.study.pojo.User;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 19:30
 **/
public interface UserDao {

    public void save(User user);
    public User findUser(int id);

}
