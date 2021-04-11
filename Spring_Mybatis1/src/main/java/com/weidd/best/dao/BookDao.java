package com.weidd.best.dao;

import com.weidd.best.pojo.Book;

import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-11 20:09
 **/
public interface BookDao {

    void saveBook(Book book);
    List<Book> findbook();

}
