package com.vinodh.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinodh.book.model.Book;
import com.vinodh.book.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Book insertNewBookInfo(Book book) {
		bookRepository.findByBookName("vinodh").forEach(System.out::println);
		return bookRepository.save(book);
	}

	public Book updateUser(Book book) {
		return bookRepository.save(book);
	}

	public Optional<Book> findByUserId(long id) {
		return bookRepository.findById(id);
	}

	public String deleteUser(long id) {
		bookRepository.deleteById(id);
		return "User has been deleted successfully";

	}

}
