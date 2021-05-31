package com.weidd.best.study.transactionaltest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-05-11 10:02
 **/
public class TransactionalTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("transactional/transactional.xml");
        PersonService personService = context.getBean(PersonService.class);
        personService.transer("jack", "mary", 100);

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
//        PersonService bean = context.getBean(PersonService.class);
//        bean.transer("jack","mary",100);

    }
}
