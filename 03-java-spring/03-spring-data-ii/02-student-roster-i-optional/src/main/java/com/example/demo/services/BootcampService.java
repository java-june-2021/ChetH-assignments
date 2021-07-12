package com.example.demo.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Address;
import com.example.demo.models.Student;
import com.example.demo.repositories.AddressRepository;
import com.example.demo.repositories.StudentRepository;

@Service
public class BootcampService {

	// adding the Student and Address repositories as dependencies
	private StudentRepository studentRepository;
	private AddressRepository addressRepository;

	public BootcampService(StudentRepository studentRepository, AddressRepository addressRepository) {
		this.studentRepository = studentRepository;
		this.addressRepository = addressRepository;
	}
	
	// returns all the students
	public List<Student> allStudents() {
		return studentRepository.findAll();
	}
	
	// creates a student
	public Student createStudent(Student s) {
		return studentRepository.save(s);
	}
	
	// returns one student
	public Student getOneStudent(Long id) {
		return studentRepository.findById(id).orElse(null);
	}

	// returns all the addresses
	public List<Address> allAddresses(Long id) {
		return addressRepository.findAll();
	}
	
	// creates an address
	public Address createAddress(Address a) {
		return addressRepository.save(a);
	}

}