package com.example.mvc.form.famlilyStatusAndAllParentInfo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "family_status")
public class FamilyStatus {

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
	@Enumerated(EnumType.STRING)
    private FamilyStatusOption familyStatusOption;
	
	private String additionalDetails;
	
	
	
//	private boolean marriedAndLiveToghther;
//	private boolean marriedAndLiveSeparate;
//	private boolean divorcedOrSeparete;
//	private boolean fatherPassedAway;
//	private boolean motherPassedAway;
//	private boolean bothParentDoNotSupport;
//	private boolean others;
	
    

}
