package com.example.mvc.form.scholarshipEssay;

import com.example.mvc.form.studentBasicInfo.StudentBasicInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Scholarship_essay")
public class ScholarshipEssay {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

    @Lob
	private String scholarshipEssay;

    @OneToOne
    @JoinColumn(name = "student_id",nullable = false)
    private StudentBasicInfo basicInfo;



    
}
