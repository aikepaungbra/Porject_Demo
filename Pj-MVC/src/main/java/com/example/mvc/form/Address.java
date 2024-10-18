package com.example.mvc.form;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Address {

    private String city_town_village;
    private String houseNum;
    private String moo;
    private String road;
    private String subDistrict;
    private String district;
    private String province;
    private int postalCode;
    
}
