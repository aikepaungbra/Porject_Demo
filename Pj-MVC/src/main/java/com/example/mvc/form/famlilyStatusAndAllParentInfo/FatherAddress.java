package com.example.mvc.form.famlilyStatusAndAllParentInfo;

import com.example.mvc.form.ParentAddress;
import com.example.mvc.form.famlilyStatusAndAllParentInfo.FamilyStatus.FamilyStatusOption;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "father_address")
public class FatherAddress extends ParentAddress{

	
}
