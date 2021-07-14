package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	// this method retrieves all the products from the database
	List<Product> findAll();
	
	// this method retrieves products not in supplied list
	List<Product> findByIdNotIn(List<Long> ids);
}