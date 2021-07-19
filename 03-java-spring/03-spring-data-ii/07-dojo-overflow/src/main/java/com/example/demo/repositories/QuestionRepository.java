package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long>{
	// this method retrieves all the categories from the database
	List<Question> findAll();
	
	// this method retrieves categories not in supplied list
	List<Question> findByIdNotIn(List<Long> ids);
}