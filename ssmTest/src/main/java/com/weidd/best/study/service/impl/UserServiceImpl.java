package com.weidd.best.study.service.impl;


import com.weidd.best.study.pojo.User;
import com.weidd.best.study.mapper.UserDao;
import com.weidd.best.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-29 15:51
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
//    @Transactional(rollbackFor = Exception.class)
    public void save(User user) {
        userDao.save(user);
//        int n =1/0;
    }


    @Override
    public User queryUserByName(String name) {
        return userDao.queryUserByName(name);
    }

    @Override
    public User queryUserById(long id) {
        return userDao.queryUserById(id);
    }

}
