package com.weidd.best.study.service.impl;


import com.weidd.best.study.mapper.BookDao;
import com.weidd.best.study.pojo.Book;

import com.weidd.best.study.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hisen on 17-4-24.
 */
@Service
public class BookServiceImpl implements BookService {

  @Autowired
  private BookDao bookDao;

  @Override
  public Book getById(long bookId) {
    return bookDao.queryById(bookId);
  }

  @Override
  public List<Book> getList(int start, int pageNum) {
    return bookDao.queryAll(start, pageNum);
  }

  @Override
  public int addBook(Book book) {
    return bookDao.addBook(book);
  }

  @Override
  public int updateBook(Book book) {
    return bookDao.updateBook(book);
  }

  @Override
  public int deleteBookById(long id) {
    return bookDao.deleteBookById(id);
  }
}
