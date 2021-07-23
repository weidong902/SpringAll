package com.weidd.best.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-07-23 15:21
 **/
public class BeanFactory {
    private  Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    //获取Bean
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    //注册BeanDefinition
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }

}
