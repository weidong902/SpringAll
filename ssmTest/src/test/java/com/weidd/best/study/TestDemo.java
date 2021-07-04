package com.weidd.best.study;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-05-30 17:46
 **/

public class TestDemo extends BaseTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private BookDao bookDao;

    @Test
    public void test() {
//        User user = userService.queryUserByName("张三");
//        System.out.println(user);
    }

    @Test //不能用单元测试去做插入,否则会重复插入.
    public void addBook() {
        System.out.println("测试");
       /* for (int i = 10; i < 100; i++) {
            Book book = new Book();
            book.setName("java编程思想" + i);
            book.setNumber(i);
            book.setDetail("java书籍" + i);
            logger.info("书表: --> " + book.toString());
            bookDao.addBook(book);
        }*/
    }
}
