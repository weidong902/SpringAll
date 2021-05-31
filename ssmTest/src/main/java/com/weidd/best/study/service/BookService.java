package com.weidd.best.study.service;

import com.weidd.best.study.pojo.Book;

import java.util.List;

/**
 * Created by hisen on 17-4-24.
 */
public interface BookService {
  Book getById(long bookId);
  List<Book> getList(int start, int pageNum);
  int addBook(Book book);
  int updateBook(Book book);
  int deleteBookById(long id);
}
