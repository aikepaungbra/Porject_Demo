package com.example.mvc.form;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WorkAddress {

    private String workPlace;
    private String workPlaceNumber;
    private String moo;
    private String road;
    private String subDistrict;
    private String district;
    private String province;
    private int postalCode;
    private int workPhoneNumber;
    
}
