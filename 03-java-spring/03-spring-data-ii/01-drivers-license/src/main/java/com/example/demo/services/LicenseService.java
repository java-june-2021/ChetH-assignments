package com.example.demo.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.License;
import com.example.demo.repositories.LicenseRepository;

@Service
public class LicenseService {

	// adding the person repository as a dependency
	private LicenseRepository licenseRepository;

	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	// returns all the license
	public List<License> allLicenses() {
		return licenseRepository.findAll();
	}
	
	// creates a license
	public License createLicense(License b) {
		return licenseRepository.save(b);
	}
	
	// retrieves a license
	public License findById(Long id) {
		Optional<License> optionalLicense = licenseRepository.findById(id);
		if(optionalLicense.isPresent()) {
			return optionalLicense.get();
		} else {
			return null;
		}
	}
}