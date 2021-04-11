package com.weidd.best.service;

import com.weidd.best.pojo.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-11 20:54
 **/
public class TestSpringMybatis {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.saveBook(new Book("java编程思想", 99));
        System.out.println("++========++++++++=======");
        List<Book> books = bookService.findbook();
        for (Book book : books) {
            System.out.println(book);
        }

    }
}
