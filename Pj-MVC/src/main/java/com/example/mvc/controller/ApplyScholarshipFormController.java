package com.example.mvc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mvc.form.ApplyScholarshipForm;
import com.example.mvc.repository.ApplyScholarshipFormRepository;

@RestController
@RequestMapping("/api/scholarships")
public class ApplyScholarshipFormController {

	@Autowired
	private ApplyScholarshipFormRepository repository;
	
	@PostMapping("/applications")
	public ResponseEntity<ApplyScholarshipForm> createApplicationForm(@RequestBody ApplyScholarshipForm applyScholarshipForm){
		
		if(repository.existsById(applyScholarshipForm.getId())) {
			
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		
		}
		
		repository.save(applyScholarshipForm);
	
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/applications")
	public ResponseEntity<List<ApplyScholarshipForm>> getAllApplications() {
		
		List<ApplyScholarshipForm> applications = repository.findAll();

		if (repository.findAll().isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(applications, HttpStatus.OK);

	}
	

	@GetMapping("/applications/{id}")
	public ResponseEntity<ApplyScholarshipForm> getApplicationById(@PathVariable Long id) {
		
		Optional<ApplyScholarshipForm> result = repository.findById(id);
		
		
		if(result.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(result.get(),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/applications/{id}")
	public ResponseEntity<ApplyScholarshipForm> DeleteById(@PathVariable Long id) {
		
		
		
		
		if(repository.findById(id).isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		repository.deleteById(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	
	
	

}
