package com.weidd.best.service;

import com.weidd.best.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-29 15:50
 **/
@Service
public interface UserService {
    void save(User user);
    User queryUserById(int id);
    User queryUserByName(String name);
}
