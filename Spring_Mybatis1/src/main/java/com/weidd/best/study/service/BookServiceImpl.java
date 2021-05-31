package com.weidd.best.study.service;


import com.weidd.best.study.mapper.BookDao1;
import com.weidd.best.study.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-11 20:31
 **/
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao1 bookDao;

    public void setBookDao(BookDao1 bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void saveBook(Book book) {
        bookDao.saveBook(book);

    }

    @Override
    public List<Book> findbook() {
        return bookDao.findbook();
    }

}
