package com.example.mvc.form;

import java.time.LocalDate;
import java.util.List;

import com.example.mvc.entity.ScholarshipApplication;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class StudentBasicInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String studentName;
	private LocalDate dateOfBirth;
	private String age;
	private String studentId;
	private String year;
	private String major;
	private String schoolOf;
	private int gpaX;
	private String phoneNumber;
	private String email;
	private String advisorName;

	private byte[] studentPhoto;

	

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<ScholarshipApplication> appliactions;

}
