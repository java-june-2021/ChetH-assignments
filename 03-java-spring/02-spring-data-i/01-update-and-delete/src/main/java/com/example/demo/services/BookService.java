// ...
package com.example.demo.services;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Book;
import com.example.demo.repositories.BookRepository;

@Service
public class BookService {
	// initialize the books variable with values
	private List<Book> books = new ArrayList<Book>();

	// adding the book repository as a dependency
	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	// returns all the books
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}
	
	// creates a book
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	
	// retrieves a book
	public Book findById(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
	// edits a book
    public void updateBook(Long id, Book book) {
        if (id < books.size()){
//            books.set(id, book);
            bookRepository.save(book);
        }
    }
    
    // deletes a book
    public void destroyBook(Long id, Book book) {
        if (id < books.size()){
//            books.remove(id);
        	bookRepository.delete(book);
        }
    }
}