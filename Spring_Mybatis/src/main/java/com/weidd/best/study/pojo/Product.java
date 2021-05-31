package com.weidd.best.study.pojo;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 23:00
 **/
public class Product {
    private String pname;//商品名
    private double price;//商品价格

    public Product() {
    }

    public Product(String pname, double price) {
        this.pname = pname;
        this.price = price;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pname='" + pname + '\'' +
                ", price=" + price +
                '}';
    }
}
