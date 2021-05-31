package com.weidd.best.study.mapper;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-08 19:25
 **/
public class UserDao1 {

    public UserDao1() {
        System.out.println("初始化,UserDao");
    }

    public void save1(String id) {
        System.out.println("保存-->" + id);
    }
}
