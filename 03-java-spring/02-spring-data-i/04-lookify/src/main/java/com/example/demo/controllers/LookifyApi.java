package com.example.demo.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Song;
import com.example.demo.services.LookifyService;
@RestController
public class LookifyApi {
	//defining our LookifysServices field
	private LookifyService lookifyService;
	
	//we can initialize our LookifyService object in the LookifysApi constructor, using Dependency Injection
	public LookifyApi(LookifyService lookifyService) {
		this.lookifyService = lookifyService;
	}
	
	@RequestMapping("/api/songs")
	public List<Song> index() {
		return lookifyService.allSongs();
	}
	
	@RequestMapping(value="/api/songs", method=RequestMethod.POST)
	public Song create(@RequestParam(value="name") String name,
		@RequestParam(value="artist") String artist,
		@RequestParam(value="rating") int rating) {
		Song song = new Song(name, artist, rating);
		return lookifyService.createSong(song);
	}
	
	@RequestMapping("/api/songs/{id}")
	public Song show(@PathVariable("id") Long id) {
		Song song = lookifyService.findById(id);
		return song;
	}
	
    @RequestMapping(value="/api/songs/{id}", method=RequestMethod.PUT)
    public Song update(@PathVariable("id") Long id, @RequestParam(value="name") String name,
    		@RequestParam(value="artist") String artist,
    		@RequestParam(value="rating") int rating) {
    	Song editSong = new Song(name, artist, rating);
    	List<Song> songs = lookifyService.allSongs();
    	lookifyService.updateSong(id, editSong, songs);
        return editSong;
    }
    
    @RequestMapping(value="/api/songs/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id, @RequestParam(value="name") String name,
    		@RequestParam(value="artist") String artist,
    		@RequestParam(value="rating") int rating) {
    		List<Song> songs = lookifyService.allSongs();
    		Song song = new Song(name, artist, rating);
        lookifyService.destroySong(id, song, songs);
    }

}