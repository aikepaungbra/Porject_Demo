package com.example.mvc.form.famlilyStatusAndAllParentInfo;

import com.example.mvc.form.ParentAddress;
import com.example.mvc.form.studentBasicInfo.StudentBasicInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mother_address")
public class MotherAddress extends ParentAddress {

	@OneToOne
	@JoinColumn(name = "student_id", nullable = false) // FK to StudentBasicInfo
	private StudentBasicInfo basicInfo;
}
