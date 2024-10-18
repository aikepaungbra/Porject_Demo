package com.example.mvc.form.usedEntity.DocumentUploadFolder;

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
@Table(name = "FamilyIncomeCertification")
public class FamilyIncomeCertifiacation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private byte[] familyIncomeCertifiacation;

    @OneToOne
    @JoinColumn(name = "student_id",nullable = false)
    private StudentBasicInfo basicInfo;
    
}
