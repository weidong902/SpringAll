package com.weidd.best.study.springtest;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-06-02 10:50
 **/
public class RedisTemplateTest {
    public static void main(String[] args) {
       /* //这里之所以只加载applicationContext.xml是因为我把spring-Redis.xml的配置直接放进了applicationContext.xml，不要问我为什么，因为我骚啊。
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        RedisUserService userService = ctx.getBean(RedisUserService.class);

        String key = "cs2";
        String result = userService.getString(key); //这里是调用我们编写userService中的getString(key)方法
        System.out.println(result);*/
    }
}
