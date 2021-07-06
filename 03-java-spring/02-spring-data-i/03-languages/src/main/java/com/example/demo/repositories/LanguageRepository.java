package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
	// this method retrieves all the languages from the database
	List<Language> findAll();

	// this method finds a language by their creator
	List<Language> findByCreatorContaining(String search);
	
	// this method finds a language by index
	Optional<Language> findById(Long id);

	// this method counts how many titles contain a certain string
	Long countByNameContaining(String search);
	
	// this method deletes a language that starts with a specific name
	Long deleteByNameStartingWith(String search);
}