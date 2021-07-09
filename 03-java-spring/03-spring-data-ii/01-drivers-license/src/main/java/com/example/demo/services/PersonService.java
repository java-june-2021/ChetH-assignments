package com.example.demo.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Person;
import com.example.demo.repositories.PersonRepository;

@Service
public class PersonService {

	// adding the person repository as a dependency
	private PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	// returns all persons
	public List<Person> allPersons() {
		return personRepository.findAll();
	}
	
	// creates a person
	public Person createPerson(Person b) {
		return personRepository.save(b);
	}
	
	// retrieves a person
	public Person findById(Long id) {
		Optional<Person> optionalPerson = personRepository.findById(id);
		if(optionalPerson.isPresent()) {
			return optionalPerson.get();
		} else {
			return null;
		}
	}
}