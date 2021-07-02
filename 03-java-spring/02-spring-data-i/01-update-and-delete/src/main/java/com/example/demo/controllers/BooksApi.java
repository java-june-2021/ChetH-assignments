package com.example.demo.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Book;
import com.example.demo.services.BookService;
@RestController
public class BooksApi {
	//defining our BookService field
	private BookService bookService;
	
	//we can initialize our BookService object in the BooksApi constructor, using Dependency Injection
	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping("/api/books")
	public List<Book> index() {
		return bookService.allBooks();
	}
	
	@RequestMapping(value="/api/books", method=RequestMethod.POST)
	public Book create(@RequestParam(value="title") String title,
		@RequestParam(value="description") String desc,
		@RequestParam(value="language") String lang,
		@RequestParam(value="pages") int numOfPages) {
		Book book = new Book(title, desc, lang, numOfPages);
		return bookService.createBook(book);
	}
	
	@RequestMapping("/api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book book = bookService.findById(id);
		return book;
	}
}