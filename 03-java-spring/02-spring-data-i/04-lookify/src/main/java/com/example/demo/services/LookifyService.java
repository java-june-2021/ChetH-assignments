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
	
	// edits a song
    public void updateSong(Long id, Song song, List<Song> songs) {
    	if (id <= songs.size()){
            lookifyRepository.save(song);
        }
    }
    
    // deletes a song
    public void destroySong(Long id, Song song, List<Song> songs) {
        if (id <= songs.size()){
        	lookifyRepository.deleteById(id);
        }
    }
}