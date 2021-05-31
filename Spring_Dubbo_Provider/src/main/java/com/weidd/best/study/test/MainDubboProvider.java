package com.weidd.best.study.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-05-16 14:33
 **/
public class MainDubboProvider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dubbo.xml");

        applicationContext.start();
        System.in.read();

    }
}
