package com.weidd.best.study.transactionaltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-05-11 09:57
 * 测试事务:编程式事务及声明式事务控制,一般情况下使用声明式事务控制.
 **/
@Service
//@Transactional
public class PersonService {

    @Autowired
    private PersonDao personDao;

//    @Autowired //编程式事务需要用到此模板
//    private TransactionTemplate jdbcTemplate;

    //没有事务的转账操作: 异常时,一部分成功一部分失败.
    /*public void transer(String fromName, String toName, int money) {
        personDao.out(fromName, money);
        int i = 1 / 0;
        personDao.in(toName, money);

    }*/

    //没有事务的转账操作: 异常时,一部分成功一部分失败.
    @Transactional //与基于AspectJ声明式事务配置的xml的形式的功能是一样的.
    public void transer(String fromName, String toName, int money) {
        personDao.out(fromName, money);
        int i = 1 / 0;
        personDao.in(toName, money);

    }


    //编程式事务:
   /* public void transer(String fromName, String toName, int money) {
        jdbcTemplate.execute(status -> {
            personDao.out(fromName, money);
            int i = 1 / 0;
            personDao.in(toName, money);
            return null;
        });
    }
*/
}
