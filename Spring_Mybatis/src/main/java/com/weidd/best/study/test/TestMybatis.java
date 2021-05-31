package com.weidd.best.study.test;

import com.weidd.best.study.pojo.Product;
import com.weidd.best.study.service1.ProductService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 21:23
 **/
public class TestMybatis {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("mybatis2.xml");
        ProductService productService = (ProductService) context.getBean("productService");
        productService.save(new Product("奥迪 "+ System.currentTimeMillis(),500000));

        List<Product> list = productService.find();
        for (Product product : list) {
            System.out.println(product);
        }
    }
}
