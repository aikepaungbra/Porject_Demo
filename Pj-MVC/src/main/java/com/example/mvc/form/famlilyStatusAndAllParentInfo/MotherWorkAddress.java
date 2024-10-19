package com.example.mvc.form.famlilyStatusAndAllParentInfo;

import com.example.mvc.form.ParentWorkAddress;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "mother_work_address")
public class MotherWorkAddress extends ParentWorkAddress{

}
