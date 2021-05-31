package com.weidd.best.study.service1;

import com.weidd.best.study.dao1.ProductDao;
import com.weidd.best.study.pojo.Product;

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
        productDao.saveProduct(product);
        throw new RuntimeException("保存失败...");
    }

    @Override
    public List<Product> find() {
        return productDao.find();
    }


}
