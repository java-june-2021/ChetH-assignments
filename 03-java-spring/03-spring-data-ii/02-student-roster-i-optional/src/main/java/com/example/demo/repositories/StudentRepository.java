package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
	// this method retrieves all the students from the database
	List<Student> findAll();

}