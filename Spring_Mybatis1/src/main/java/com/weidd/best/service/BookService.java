package com.weidd.best.service;

import com.weidd.best.pojo.Book;

import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-11 20:30
 **/
public interface BookService {
    void saveBook(Book book);
    List<Book> findbook();
}
