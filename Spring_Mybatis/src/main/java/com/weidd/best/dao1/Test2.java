package com.weidd.best.dao1;

import com.weidd.best.pojo.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 23:03
 **/
public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mybatis2.xml");
        ProductDao productDao = (ProductDao) context.getBean("productDao");
        productDao.saveProduct(new Product("奔驰",400000.00));

    }
}
