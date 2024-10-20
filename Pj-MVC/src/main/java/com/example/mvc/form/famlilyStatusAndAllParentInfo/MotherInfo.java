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
@Table(name = "mother_info")
public class MotherInfo extends ParentInfo {

	@OneToOne
	@JoinColumn(name = "student_id", nullable = false) // FK to StudentBasicInfo
	private StudentBasicInfo basicInfo;



}
