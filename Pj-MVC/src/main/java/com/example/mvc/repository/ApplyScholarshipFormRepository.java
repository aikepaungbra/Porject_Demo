package com.example.mvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.mvc.form.ApplyScholarshipForm;

@Repository
public interface ApplyScholarshipFormRepository extends CrudRepository<ApplyScholarshipForm, Long> {
	
	public List<ApplyScholarshipForm> findAll();
	public ApplyScholarshipForm findById(long id);

}
