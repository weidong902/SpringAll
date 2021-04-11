package com.weidd.best.service1;

import com.weidd.best.dao1.ProductDao;
import com.weidd.best.pojo.Product;

import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 19:34
 **/
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public List<Product> find() {
        return productDao.find();
    }


}
