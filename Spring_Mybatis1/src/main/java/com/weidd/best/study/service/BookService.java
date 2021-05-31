package com.weidd.best.study.service;

import com.weidd.best.study.pojo.Book;

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
