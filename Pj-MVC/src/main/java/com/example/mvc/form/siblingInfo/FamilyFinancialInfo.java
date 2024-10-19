package com.example.mvc.form.siblingInfo;

import com.example.mvc.form.studentBasicInfo.StudentBasicInfo;

import jakarta.persistence.Embeddable;
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
@Table(name = "family_financial_info")
public class FamilyFinancialInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private int totalFamilyIncome;
    private int totalFamilyExpensive;
    private int totalMontylyDebt;
    
    @OneToOne
    @JoinColumn(name = "student_id", nullable = false)
	private StudentBasicInfo basicInfo;
	
    
}
