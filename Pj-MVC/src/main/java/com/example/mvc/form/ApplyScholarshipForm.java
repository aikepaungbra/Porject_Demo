package com.example.mvc.form;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "apply_scholarship_form")  
public class ApplyScholarshipForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Embedded
	private StudentBasicInfo basicInfo;
	
	@Embedded
	private PermanentAddress permanentAddress;
	
	@Embedded
	private CurrentAddress currentAddress;
	
	@Embedded
	private ScholarshipHistory scholarshipHistory;
	
	@Embedded
	private FamilyStatus familyStatus;
	
	@Embedded
	private FatherInfo fatherInfo;
	
	@Embedded
	private MotherInfo motherInfo;
	
	@Embedded
	private GuardianInfo guardianInfo;
	
	@Embedded
	private SiblingInfo siblingInfo;
	
	@Embedded
	private FamilyFinancialInfo familyFinancialInfo;
	
	@Embedded
	private DocumentUpload documentUpload;
	

}
