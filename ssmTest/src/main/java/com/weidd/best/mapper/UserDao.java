package com.weidd.best.mapper;


import com.weidd.best.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-29 13:16
 **/
@Repository
public interface UserDao {
    void save(User user);
    User queryUserById(int id);
    User queryUserByName(String name);
}
