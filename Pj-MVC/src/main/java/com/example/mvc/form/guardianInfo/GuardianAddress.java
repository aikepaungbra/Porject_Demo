package com.example.mvc.form.guardianInfo;

import com.example.mvc.form.ParentAddress;
import com.example.mvc.form.studentBasicInfo.StudentBasicInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "guardian_address")
public class GuardianAddress extends ParentAddress {

	@OneToOne
	@JoinColumn(name = "student_id", nullable = false) // FK to StudentBasicInfo
	private StudentBasicInfo basicInfo;
}
