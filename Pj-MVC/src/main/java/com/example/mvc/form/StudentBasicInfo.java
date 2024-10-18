package com.example.mvc.form;

import java.time.LocalDate;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class StudentBasicInfo {


	private String studentName;
	private LocalDate dateOfBirth;
	private int age;
	private String studentId;
	private String year;
	private String major;
	private String schoolOf;
	private double gpaX;
	private String phoneNumber;
	private String email;
	private String advisorName;

	private byte[] studentPhoto;

	

	

}
