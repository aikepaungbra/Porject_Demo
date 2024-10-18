package com.example.mvc.form;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class GuardianInfo {

    //Gurdian doesn't have age
	public String gurdian_name;
    public String gurdian_occupation;
    public String gurdian_position;
    public int gurdian_monthlyIncome;
    public int gurdian_yearlyIncome;
    public String gurdian_landOwned_rent_Rai;
    public int gurdian_phoneNumber;
    
    private String gurdian_city_town_village;
    private String gurdian_houseNum;
    private String gurdian_moo;
    private String gurdian_road;
    private String gurdian_subDistrict;
    private String gurdian_district;
    private String gurdian_province;
    private int gurdian_postalCode;
    
    private String gurdian_workPlace;
    private String gurdian_workPlaceNumber;
    private String gurdian_workMoo;
    private String gurdian_workRoad;
    private String gurdian_workSubDistrict;
    private String gurdian_workDistrict;
    private String gurdian_workProvince;
    private int gurdian_workPostalCode;
    private int gurdian_workPhoneNumber;
    
    private String gurdian_relationship;
    private int gurdian_monthlySupport;

}
