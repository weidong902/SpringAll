package com.weidd.best.service;

import com.weidd.best.dao.UserDao;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-08 19:57
 **/
public class UserService {

    //给需要注入的对象提供set方法,同时
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(String id) {
        userDao.save(id);
    }
}
