package com.example.mvc.form;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "guardianInfo")
public class GuardianInfo {

    //Gurdian doesn't have age
	@Embedded
    private PersonalInfo guardianInfo;
    
    @Embedded
    private Address gurdianAddress;
    
    @Embedded
    private WorkAddress gurdianWorkAddress;
    
    private String relationship;
    private int monthlySupport;

}
