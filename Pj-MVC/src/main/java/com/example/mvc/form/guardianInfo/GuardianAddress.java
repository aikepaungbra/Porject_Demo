package com.example.mvc.form.guardianInfo;

import com.example.mvc.form.ParentAddress;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "guardian_address")
public class GuardianAddress extends ParentAddress{

}
