package com.example.demo.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Song;
import com.example.demo.services.LookifyService;

@Controller
public class LookifyController {
	private final LookifyService lookifyService;
	
	public LookifyController(LookifyService lookifyService) {
		this.lookifyService = lookifyService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		return "/index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = lookifyService.allSongs();
		model.addAttribute("songs", songs);
		return "/dashboard.jsp";
	}
	
	@RequestMapping("/search")
	public String searchSong(@RequestParam("artist") String artist, Model model) {
		model.addAttribute("songs", lookifyService.songsContainingArtist(artist));
		model.addAttribute("artist", artist);
		return "/search.jsp";
	}
	
	@RequestMapping("/topten")
	public String topTen(Model model) {
		List<Song> songs = lookifyService.topTenByRating();
		model.addAttribute("songs", songs);
		return "/topten.jsp";
	}
	
	@RequestMapping("/{index}")
	public String findSongByIndex(Model model, @PathVariable("index") Long index) {
		Song song = lookifyService.findById(index);
		model.addAttribute("song", song);
		return "/show.jsp";
	}
	
	@RequestMapping("/new")
	public String newSong(@ModelAttribute("song") Song song) {
		return "/new.jsp";
	}

	@RequestMapping(value="/new", method=RequestMethod.POST)
	public String addSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if (result.hasErrors()) {
			return "/new.jsp";
		}
		lookifyService.createSong(song);
		return "redirect:/dashboard";
	}

    @RequestMapping(value="/delete/{id}")
    public String destroySong(@PathVariable("id") Long id) {
    	lookifyService.destroySong(id);
		return "redirect:/dashboard";
    }
}