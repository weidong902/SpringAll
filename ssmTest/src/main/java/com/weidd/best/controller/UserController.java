package com.weidd.best.controller;

import com.weidd.best.pojo.User;
import com.weidd.best.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-29 13:28
 **/
@Controller
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    @Bean

    @RequestMapping("/save")
    @ResponseBody
    public String saveUser(@RequestParam("name") String name, @RequestParam("password") String password) {
        try {
            logger.info(name + "++++++" + password);
            userService.save(new User(name, password));
            return userService.queryUserByName(name).toString();
        } catch (Exception e) {
            return "fail";
        }
    }

    @RequestMapping("/savePath/{name1}/{password1}")
    @ResponseBody
    public String saveUser1(@PathVariable(name = "name1") String name, @PathVariable(name = "password1") String password) {
        try {
            logger.info(name + "++++++" + password);
            userService.save(new User(name, password));
            return userService.queryUserByName(name).toString();
        } catch (Exception e) {
            return "fail";
        }
    }
}
