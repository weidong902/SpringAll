package com.weidd.best.study.mapper;


import com.weidd.best.study.pojo.User;

import org.springframework.stereotype.Repository;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-29 13:16
 **/
@Repository
public interface UserDao {
    void save(User user);
    User queryUserById(long id);
    User queryUserByName(String name);
}
