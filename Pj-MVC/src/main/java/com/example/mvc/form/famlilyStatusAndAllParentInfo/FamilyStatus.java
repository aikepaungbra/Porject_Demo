package com.example.mvc.form.famlilyStatusAndAllParentInfo;

import com.example.mvc.form.studentBasicInfo.StudentBasicInfo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "family_status")
public class FamilyStatus {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
	
	@Enumerated(EnumType.STRING)
    private FamilyStatusOption familyStatusOption;
	
	private String additionalDetails;
	
	@OneToOne
    @JoinColumn(name = "student_id", nullable = false) // FK to StudentBasicInfo
    private StudentBasicInfo basicInfo;

    // need selection for the choose one option
	
	
	public enum FamilyStatusOption{
		marriedAndLiveToghther,
		marriedAndLiveSeparate,
		divorcedOrSeparete,
		fatherPassedAway,
		motherPassedAway,
		bothParentDoNotSupport,
		others,
		
		
	}
	
	
	
	
	
//	private boolean marriedAndLiveToghther;
//	private boolean marriedAndLiveSeparate;
//	private boolean divorcedOrSeparete;
//	private boolean fatherPassedAway;
//	private boolean motherPassedAway;
//	private boolean bothParentDoNotSupport;
//	private boolean others;
	
    

}
