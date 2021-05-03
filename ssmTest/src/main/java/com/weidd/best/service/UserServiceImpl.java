package com.weidd.best.service;


import com.weidd.best.mapper.UserDao;
import com.weidd.best.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-29 15:51
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User queryUserById(int id) {
        return userDao.queryUserById(id);
    }

    @Override
    public User queryUserByName(String name) {
        return  userDao.queryUserByName(name);
    }

}
