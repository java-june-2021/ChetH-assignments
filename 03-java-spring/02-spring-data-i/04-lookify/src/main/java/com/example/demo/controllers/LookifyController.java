package com.example.demo.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		model.addAttribute("newSong", new Song());
		return "/dashboard.jsp";
	}
	
	@RequestMapping("/{index}")
	public String findSongByIndex(Model model, @PathVariable("index") Long index) {
		Song song = lookifyService.findById(index);
		model.addAttribute("song", song);
		return "/show.jsp";
	}
	
	@RequestMapping("/new")
	public String newSong(@ModelAttribute("song") Song song) {
		return "/index.jsp";
	}

	@RequestMapping(value="/new", method=RequestMethod.POST)
	public String addSong(@Valid @ModelAttribute("newSong") Song song, BindingResult result) {
		if (result.hasErrors()) {
			return "/index.jsp";
		} else {
			lookifyService.createSong(song);
    		return "redirect:/";
		}
	}
	
    @RequestMapping("/edit/{id}")
    public String editSong(@PathVariable("id") Long id, Model model) {
        Song song = lookifyService.findById(id);
        if (song != null){
            model.addAttribute("song", song);
            return "/edit.jsp";
        }else{
    		return "redirect:/";
        }
    }
    
    @PostMapping("/edit/{id}")
    public String updateSong(@PathVariable("id") Long id, @Valid @ModelAttribute("song") Song song, BindingResult result) {
        if (result.hasErrors()) {
            return "/edit.jsp";
        }else{
            List<Song> songs = lookifyService.allSongs();
            lookifyService.updateSong(id, song, songs);
    		return "redirect:/";
        }
    }

    @RequestMapping(value="/delete/{id}")
    public String destroySong(@PathVariable("id") Long id, @ModelAttribute("song") Song song) {
        List<Song> songs = lookifyService.allSongs();
    	lookifyService.destroySong(id, song, songs);
		return "redirect:/";
    }
}