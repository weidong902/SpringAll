package com.weidd.best.study.test;

import com.weidd.best.study.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-05-16 15:47
 **/
public class ConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo.xml");
        UserService userService = (UserService) context.getBean("userService");
        String name = userService.fingName("张三");
        System.out.println(name);

    }
}
