package com.weidd.best.service1;

import com.weidd.best.dao1.ProductDao;
import com.weidd.best.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
