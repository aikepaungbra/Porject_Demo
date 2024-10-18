package com.example.mvc.form;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "fatherInfo")
public class FatherInfo {

	@Embedded
    private PersonalInfo fatherInfo;
    
	@Embedded
    private Address fatherAddress;
    
	@Embedded
    private WorkAddress fatherWorkAddress;


}
