package com.weidd.best.study.annotationtest;

import com.weidd.best.study.annotationtest.configurationBean.Congiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-29 13:14
 **/
public class AnnotationTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Congiguration.class);
    }
}
