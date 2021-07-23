package com.weidd.best.springframework;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-07-23 15:22
 **/
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean=bean;
    }

    public Object getBean() {
        return bean;
    }

}
