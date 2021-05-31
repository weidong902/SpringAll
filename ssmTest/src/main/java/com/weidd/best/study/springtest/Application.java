package com.weidd.best.study.springtest;

import com.weidd.best.study.mapper.BookDao;
import com.weidd.best.study.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-05-08 10:15
 **/
@Component
public class Application {

    // 方式1: 使用set方法
    private static BookDao bookDao;

    @Autowired
    public void setBookDao(BookDao bookDao) {
        Application.bookDao = bookDao;
    }

    //方式2:使用构造方法
   /* private static BookDao bookDao;
    @Autowired
    public Application(BookDao bookDao) {
        Application.bookDao = bookDao;
    }*/


    //方式3:使用@PostConstruct注解(意义不是很大,主要了解下@PostConstruct注解)
   /* private static BookDao bookDao;
    @Autowired
    private BookDao bookDao1;

    @PostConstruct //该注解在构造方法之后会被执行
    private void beforeInit() {
        this.bookDao = bookDao1;
    }*/

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        for (int i = 10; i < 100; i++) {
            Book book = new Book();
            book.setName("java编程思想" + i);
            book.setNumber(i);
            book.setDetail("java书籍" + i);
            bookDao.addBook(book);
        }
    }
}
