package com.example.mvc.form.usedEntity.DocumentUploadFolder;

import java.time.LocalDate;

import com.example.mvc.form.usedEntity.StudentBasicInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Signature")
public class Signature{

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String signature;
	private LocalDate scholarship_date;

    @OneToOne
    @JoinColumn(name = "student_id",nullable = false)
    private StudentBasicInfo basicInfo;
    
}
