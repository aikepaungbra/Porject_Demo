package com.example.mvc.form.famlilyStatusAndAllParentInfo;

import com.example.mvc.form.ParentInfo;
import com.example.mvc.form.studentBasicInfo.StudentBasicInfo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "father_info")
public class FatherInfo extends ParentInfo{
	
	
	@OneToOne
    @JoinColumn(name = "student_id", nullable = false) // FK to StudentBasicInfo
    private StudentBasicInfo basicInfo;
	
	


//    public String father_name;
//    public int fatherAge;
//    public String father_occupation;
//    public String father_position;
//    public int father_monthlyIncome;
//    public int father_yearlyIncome;
//    public String father_landOwned_rent_Rai;
//    public int father_phoneNumber;
//
//    private String father_city_town_village;
//    private String father_houseNum;
//    private String father_moo;
//    private String father_road;
//    private String father_subDistrict;
//    private String father_district;
//    private String father_province;
//    private int father_postalCode;
//    
//	private String father_workPlace;
//    private String father_workPlaceNumber;
//    private String father_workMoo;
//    private String father_workRoad;
//    private String father_workSubDistrict;
//    private String father_workDistrict;
//    private String father_workProvince;
//    private int father_workPostalCode;
//    private int father_workPhoneNumber;


}
