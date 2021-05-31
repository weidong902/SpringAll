package com.weidd.best.study;

import com.weidd.best.study.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-08 19:27
 **/
public class TestSpring {
    private static Logger logger = LoggerFactory.getLogger(TestSpring.class);
    public static void main(String[] args) {

          ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save("2131");
//        logger.info("获取 Bean：{}", applicationContext.getBean("userService"));
//        logger.info("获取 Bean 通过别名：{}", applicationContext.getBean("userService-alias01"));
//        logger.info("获取 Bean 通过别名的别名：{}", applicationContext.getBean("userService-alias02"));

    }
}

