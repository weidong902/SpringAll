package com.weidd.best.study;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-05-30 17:47
 **/
// 修改启动类，使用Spring的测试启动类
@RunWith(SpringJUnit4ClassRunner.class)
// 加载配置文件，否则无法注入
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public abstract class BaseTest {

}
