package com.weidd.best.study.service1;

import com.weidd.best.study.pojo.Product;

import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 19:33
 **/
public interface ProductService {

    void save(Product product);

     List<Product> find();
}
