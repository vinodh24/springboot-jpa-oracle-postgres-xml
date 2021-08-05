package com.vinodh.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinodh.book.model.Book;
import com.vinodh.service.BookService;


@RestController
@RequestMapping("/books")
public class BookController{

	private static final Logger log = LoggerFactory.getLogger(BookController.class);

	@Autowired
	private BookService bookService;

	@PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
	public Book createOrSaveBookInfo(@RequestBody Book book) {
		log.info("doing addbook..."+book);
		return bookService.insertNewBookInfo(book);
	}
	
	@PutMapping(path= "/updateUser", consumes = "application/json", produces = "application/json")
	public Book updateUser(@RequestBody Book book)
	{
		return bookService.updateUser(book);
	}
	
	@GetMapping(path= "/findByUserId/{id}", produces = "application/json")
	public Optional<Book> findByUserId(@PathVariable long id )
	{
		return bookService.findByUserId(id);
	}
	
	@DeleteMapping(path= "/deleteByUserId/{id}", produces = "application/json")
	public String deleteUser(@PathVariable long id )
	{
		return bookService.deleteUser(id);
	}



}