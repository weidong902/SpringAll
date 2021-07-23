package com.weidd.best.test;

import com.weidd.best.springframework.BeanDefinition;
import com.weidd.best.springframework.BeanFactory;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-07-23 15:30
 **/
public class MainTest {
    public static void main(String[] args) {
        // 1 初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        //2 注册Bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        BeanDefinition beanDefinition1 = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService1", beanDefinition);

        // 3 获取Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        UserService userService1 = (UserService) beanFactory.getBean("userService1");
        userService.queryUserInfo();
        userService1.queryUserInfo();


    }
}
