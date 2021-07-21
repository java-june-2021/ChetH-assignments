package com.example.demo.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Song;
import com.example.demo.repositories.LookifyRepository;

@Service
public class LookifyService {

	// adding the song repository as a dependency
	private LookifyRepository lookifyRepository;

	public LookifyService(LookifyRepository lookifyRepository) {
		this.lookifyRepository = lookifyRepository;
	}
	
	// returns all the songs
	public List<Song> allSongs() {
		return lookifyRepository.findAll();
	}
	
	// creates a song
	public Song createSong(Song b) {
		return lookifyRepository.save(b);
	}
	
	// retrieves a song
	public Song findById(Long id) {
		Optional<Song> optionalSong = lookifyRepository.findById(id);
		if(optionalSong.isPresent()) {
			return optionalSong.get();
		} else {
			return null;
		}
	}
	
	// retrieves top 10 by rating
	public List<Song> topTenByRating() {
		return lookifyRepository.findTop10ByOrderByRatingDesc();
	}
	
	// retrieves songs by artist
	public List<Song> songsContainingArtist(String artist) {
		return lookifyRepository.findByArtistContaining(artist);
	}
    
    // deletes a song
    public void destroySong(Long id) {
    	lookifyRepository.deleteById(id);
    }
}