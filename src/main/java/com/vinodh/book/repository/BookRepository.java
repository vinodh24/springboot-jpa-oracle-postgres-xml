package com.vinodh.book.repository;

import java.util.List;

import com.vinodh.book.model.Book;
import com.vinodh.repository.GenericDAO;

public interface BookRepository extends GenericDAO<Book>{

	List<Book> findByBookName(String bookName);
}
