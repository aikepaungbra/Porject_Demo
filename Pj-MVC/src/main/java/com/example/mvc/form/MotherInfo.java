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

	public String name;
    public int age;
    public String occupation;
    public String position;
    public int monthlyIncome;
    public int yearlyIncome;
    public String landOwned_rent_Rai;
    public int phoneNumber;

	private String city_town_village;
    private String houseNum;
    private String moo;
    private String road;
    private String subDistrict;
    private String district;
    private String province;
    private int postalCode;

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
