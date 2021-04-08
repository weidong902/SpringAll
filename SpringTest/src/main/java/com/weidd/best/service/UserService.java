package com.weidd.best.service;

import com.weidd.best.dao.UserDao;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-08 19:57
 **/
public class UserService {

    /**
     * 控制反转依赖注入的操作步骤:
     * 需要哪个组件,将哪个组件声明为成员变量,
     * 注入时提供Set方法.
     */
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(String id) {
        userDao.save(id);
    }
}
