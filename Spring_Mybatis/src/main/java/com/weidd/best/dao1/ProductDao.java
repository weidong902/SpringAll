package com.weidd.best.dao1;

import com.weidd.best.pojo.Product;

import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 22:59
 **/
public interface ProductDao {
    void saveProduct(Product product);

    List<Product> find();
}
