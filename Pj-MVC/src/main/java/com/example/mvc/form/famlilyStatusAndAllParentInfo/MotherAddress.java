package com.example.mvc.form.famlilyStatusAndAllParentInfo;

import com.example.mvc.form.ParentAddress;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "mother_address")
public class MotherAddress extends ParentAddress{

}
