package com.example.demo.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Dojo;
import com.example.demo.models.Ninja;
import com.example.demo.repositories.DojoRepository;
import com.example.demo.repositories.NinjaRepository;

@Service
public class BootcampService {

	// adding the Dojo and Ninja repositories as dependencies
	private DojoRepository dojoRepository;
	private NinjaRepository ninjaRepository;

	public BootcampService(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
		this.dojoRepository = dojoRepository;
		this.ninjaRepository = ninjaRepository;
	}
	
	// returns all the dojos
	public List<Dojo> allDojos() {
		return dojoRepository.findAll();
	}
	
	// creates a dojo
	public Dojo createDojo(Dojo d) {
		return dojoRepository.save(d);
	}
	
	// returns one dojo
	public Dojo getOneDojo(Long id) {
		return dojoRepository.findById(id).orElse(null);
	}

	// returns all the ninjas
	public Optional<Ninja> allNinjas(Long id) {
		return ninjaRepository.findAll(id);
	}
	
	// creates a ninja
	public Ninja createNinja(Ninja n) {
		return ninjaRepository.save(n);
	}

}