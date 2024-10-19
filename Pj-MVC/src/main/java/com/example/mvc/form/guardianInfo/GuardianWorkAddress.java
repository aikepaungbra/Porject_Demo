package com.example.mvc.form.guardianInfo;

import com.example.mvc.form.ParentWorkAddress;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "father_work_address")
public class GuardianWorkAddress extends ParentWorkAddress{

}
