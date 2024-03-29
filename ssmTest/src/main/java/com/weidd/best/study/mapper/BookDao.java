package com.weidd.best.study.mapper;

import com.weidd.best.study.pojo.Book;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
  Book queryById(long id);
  List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
  int addBook(Book book);
  int updateBook(Book book);
  int deleteBookById(long id);
}
