package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
	// this method retrieves all the categories from the database
	List<Category> findAll();
	
	// this method retrieves categories not in supplied list
	List<Category> findByIdNotIn(List<Long> ids);
}