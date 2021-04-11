package com.weidd.best.test;

import com.weidd.best.pojo.Product;
import com.weidd.best.service1.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Random;

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
