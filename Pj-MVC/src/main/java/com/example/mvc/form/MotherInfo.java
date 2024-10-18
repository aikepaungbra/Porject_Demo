package com.example.mvc.form;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "motherInfo")
public class MotherInfo {


	@Embedded
	private PersonalInfo motherInfo;

	@Embedded
	private Address motherAddress;

	@Embedded
	private WorkAddress motherWorkAddress;

}
