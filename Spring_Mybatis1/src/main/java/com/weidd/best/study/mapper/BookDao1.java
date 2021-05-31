package com.weidd.best.study.mapper;

import com.weidd.best.study.pojo.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-11 20:09
 **/
@Repository
public interface BookDao1 {

    void saveBook(Book book);
    List<Book> findbook();

}
