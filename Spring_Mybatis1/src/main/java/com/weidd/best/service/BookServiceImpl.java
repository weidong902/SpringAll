package com.weidd.best.service;

import com.weidd.best.dao.BookDao;
import com.weidd.best.pojo.Book;

import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-11 20:31
 **/
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
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
