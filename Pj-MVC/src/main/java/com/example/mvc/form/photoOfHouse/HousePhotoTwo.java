package com.example.mvc.form.photoOfHouse;

import com.example.mvc.form.studentBasicInfo.StudentBasicInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "housePhoto_two")
public class HousePhotoTwo {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private byte[] housePhoto1;

    @OneToOne
    @JoinColumn(name = "student_id",nullable = false)
    private StudentBasicInfo basicInfo;
    
}
