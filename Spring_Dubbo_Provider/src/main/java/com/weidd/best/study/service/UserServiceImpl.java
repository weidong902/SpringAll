package com.weidd.best.study.service;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-05-16 14:19
 **/
public class UserServiceImpl implements UserService {
    @Override
    public String fingName(String name) {
        System.out.println("姓名: " + name);
        return "Provider Hello:---> " + name;
    }

    @Override
    public void addUser(String userName) {
        System.out.println("添加用户名 :" + userName);
    }
}
