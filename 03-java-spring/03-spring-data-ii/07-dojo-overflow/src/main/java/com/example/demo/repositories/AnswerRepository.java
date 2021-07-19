package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long>{
	// this method retrieves all the products from the database
	List<Answer> findAll();
	
	// this method retrieves products not in supplied list
	List<Answer> findByIdNotIn(List<Long> ids);
}