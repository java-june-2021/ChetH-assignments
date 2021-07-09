package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long>{
	// this method retrieves all the licenses from the database
	List<License> findAll();
}