package com.weidd.best.study.transactionaltest.propagation;

import com.weidd.best.study.transactionaltest.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-05-11 09:57
 * 测试事务的传播特性
 **/
@Service
//@Transactional
public class PersonService {

    @Autowired
    private PersonDao personDao;

    @Autowired
    private PersonService personService;

    //没有事务的转账操作: 异常时,一部分成功一部分失败.
    @Transactional //与基于AspectJ声明式事务配置的xml的形式的功能是一样的.
    public void transer(String fromName, String toName, int money) {
        personDao.out(fromName, money);
        int i = 1 / 0;
        personDao.in(toName, money);
    }

}
