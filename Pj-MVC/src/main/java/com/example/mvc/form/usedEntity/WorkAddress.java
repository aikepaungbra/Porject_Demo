package com.example.mvc.form.usedEntity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class WorkAddress {

    private String workPlace;
    private String workPlaceNumber;
    private String workMoo;
    private String workRoad;
    private String workSubDistrict;
    private String workDistrict;
    private String workProvince;
    private int workPostalCode;
    private int workPhoneNumber;
    
}
