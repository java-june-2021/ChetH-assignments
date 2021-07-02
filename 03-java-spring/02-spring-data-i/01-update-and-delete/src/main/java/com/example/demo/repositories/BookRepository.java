package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	// this method retrieves all the books from the database
	List<Book> findAll();

	// this method finds a book by their description
	List<Book> findByDescriptionContaining(String search);
	
	// this method finds a book by index
	Optional<Book> findById(Long id);

	// this method counts how many titles contain a certain string
	Long countByTitleContaining(String search);
	
	// this method deletes a book that starts with a specific title
	Long deleteByTitleStartingWith(String search);
}