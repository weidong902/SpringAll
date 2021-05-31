package com.weidd.best.study.study.controller;

import com.weidd.best.study.study.service.RedisService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;


/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-05-28 20:51
 **/

@RestController
@RequestMapping("/redis")
public class RedisController {


    @Autowired
    RedisService redisService;

    @RequestMapping(value = "/set", method = {RequestMethod.GET})
    public String set(@RequestParam String value) {
        redisService.set("testredis", value);
        return "0000";
    }

    @RequestMapping(value = "/get", method = {RequestMethod.GET})
    public String get() {
        String value = (String) redisService.get("testredis");

        return value;
    }

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("name11","lisi");
        System.out.println(jedis.get("name11"));
    }
}
