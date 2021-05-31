package com.weidd.best.study.service;

import com.weidd.best.study.mapper.UserDao1;


import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-08 19:57
 **/
public class UserService {
    private String username;
    private Integer age;
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 控制反转依赖注入的操作步骤:
     * 需要哪个组件,将哪个组件声明为成员变量,
     * 注入时提供Set方法.
     */
    private UserDao1 userDao;
    public void setUserDao(UserDao1 userDao) {
        this.userDao = userDao;
    }

    public void save(String id) {
        userDao.save1(id);
        System.out.println("username: "+ this.username);
        System.out.println("username: "+ this.age);
        System.out.println("---------------------遍历list----------------");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
