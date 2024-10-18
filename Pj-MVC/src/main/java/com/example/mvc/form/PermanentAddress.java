package com.example.mvc.form;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "permanentAddress")
public class PermanentAddress {
    
	@Embedded
    private Address permanentAddress;
   

}
