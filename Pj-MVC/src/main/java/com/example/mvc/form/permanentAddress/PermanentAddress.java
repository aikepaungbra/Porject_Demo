package com.example.mvc.form.permanentAddress;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class PermanentAddress {
    
	
    private String permanent_city_town_village;
    private String permanent_houseNum;
    private String permanent_moo;
    private String permanent_road;
    private String permanent_subDistrict;
    private String permanent_district;
    private String permanent_province;
    private int permanent_postalCode;
   

}
