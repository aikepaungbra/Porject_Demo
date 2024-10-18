package com.example.mvc.form;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class FamilyStatus {

    // need selection for the choose one option
	private boolean marriedAndLiveToghther;
	private boolean marriedAndLiveSeparate;
	private boolean divorcedOrSeparete;
	private boolean fatherPassedAway;
	private boolean motherPassedAway;
	private boolean bothParentDoNotSupport;
	private boolean others;
	private String text;
    

}
