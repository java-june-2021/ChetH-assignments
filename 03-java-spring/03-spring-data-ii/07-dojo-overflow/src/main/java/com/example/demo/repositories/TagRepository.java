package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long>{
	// this method retrieves all the products from the database
	List<Tag> findAll();
	
	// this method retrieves products not in supplied list
	List<Tag> findByIdNotIn(List<Long> ids);
	
	// looks for existence of tags in database
	boolean existsBySubject(String tag);
	
	// find one tag in database
	Tag findBySubject(String tag);
}