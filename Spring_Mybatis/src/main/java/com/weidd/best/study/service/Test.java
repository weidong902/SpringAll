package com.weidd.best.study.service;

import com.weidd.best.study.dao.UserDao;
import com.weidd.best.study.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 21:23
 **/
public class Test {
    public static void main(String[] args) throws SQLException {

      /*  DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/testdb");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("3.014/*-+");
        System.out.println(druidDataSource.getConnection());*/
        ApplicationContext context = new ClassPathXmlApplicationContext("mybatis1.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
//        userDao.save(new User("张三",23,"北京"));
        User user = userDao.findUser(1);
        System.out.println("查用户--> "+user);
    }

}
