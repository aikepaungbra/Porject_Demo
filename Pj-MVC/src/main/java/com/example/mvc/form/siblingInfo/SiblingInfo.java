package com.example.mvc.form.siblingInfo;

import java.time.LocalDate;

import com.example.mvc.form.studentBasicInfo.StudentBasicInfo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "sibling_info")
public class SiblingInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sibling_Name;
    private LocalDate sibling_birthday;
    private int sibling_age;
    private String sibling_occupation;
    private String sibling_education;
    private int sibling_monthlyIncome;
    
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
	private StudentBasicInfo basicInfo;

}
