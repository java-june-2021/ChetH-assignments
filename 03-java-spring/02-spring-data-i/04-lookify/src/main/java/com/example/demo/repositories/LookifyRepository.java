package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Song;

@Repository
public interface LookifyRepository extends CrudRepository<Song, Long>{
	// this method retrieves all the songs from the database
	List<Song> findAll();

	// this method finds a song by their artist
	List<Song> findByArtistContaining(String search);
	
	// this method finds a song by index
	Optional<Song> findById(Long id);

	// this method counts how many songs contain a certain string
	Long countByNameContaining(String search);
	
	// this method deletes a song that starts with a specific name
	Long deleteByNameStartingWith(String search);
}