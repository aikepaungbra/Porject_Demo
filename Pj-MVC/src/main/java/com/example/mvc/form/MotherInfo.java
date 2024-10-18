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
public class MotherInfo {

	public String mother_name;
    public int mother_Age;
    public String mother_occupation;
    public String mother_position;
    public int mother_monthlyIncome;
    public int mother_yearlyIncome;
    public String mother_landOwned_rent_Rai;
    public int mother_phoneNumber;

	private String mother_city_town_village;
    private String mother_houseNum;
    private String mother_moo;
    private String mother_road;
    private String mother_subDistrict;
    private String mother_district;
    private String mother_province;
    private int mother_postalCode;

	private String mother_workPlace;
    private String mother_workPlaceNumber;
    private String mother_workMoo;
    private String mother_workRoad;
    private String mother_workSubDistrict;
    private String mother_workDistrict;
    private String mother_workProvince;
    private int mother_workPostalCode;
    private int mother_workPhoneNumber;

}
