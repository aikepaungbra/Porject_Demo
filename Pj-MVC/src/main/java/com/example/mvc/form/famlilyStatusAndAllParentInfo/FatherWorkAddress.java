package com.example.mvc.form.famlilyStatusAndAllParentInfo;

import com.example.mvc.form.ParentWorkAddress;
import com.example.mvc.form.studentBasicInfo.StudentBasicInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "father_work_address")
public class FatherWorkAddress extends ParentWorkAddress {

	@OneToOne
	@JoinColumn(name = "student_id", nullable = false) // FK to StudentBasicInfo
	private StudentBasicInfo basicInfo;
}
