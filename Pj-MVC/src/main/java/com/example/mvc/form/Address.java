package com.example.mvc.form;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
    private String city_town_village;
    private String houseNum;
    private String moo;
    private String road;
    private String subDistrict;
    private String district;
    private String province;
    private int postalCode;
    
    
    
}
