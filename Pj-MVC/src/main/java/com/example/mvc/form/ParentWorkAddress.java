package com.example.mvc.form;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass
public class ParentWorkAddress {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String work_place;
    private String num;
    private String moo;
    private String road;
    private String subDistrict;
    private String district;
    private String province;
    private int postal_Code;
    private int work_phone_Number;

}
