package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	// this method retrieves all the ninjas from the database
	@Query(value="SELECT * FROM ninjas WHERE dojo_id = id", nativeQuery=true)
	Optional<Ninja> findAll(Long id);
}