package com.example.mvc.form.usedEntity;

import com.example.mvc.form.Address;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "current_address")
public class CurrentAddress extends Address{
	
	@OneToOne
    @JoinColumn(name = "student_id", nullable = false)
	private StudentBasicInfo basicInfo;
	
	
	

//	private String current_city_town_village;
//    private String current_houseNum;
//    private String current_moo;
//    private String current_road;
//    private String current_subDistrict;
//    private String current_district;
//    private String current_province;
//    private int current_postalCode;

}
