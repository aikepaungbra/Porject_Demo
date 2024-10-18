package com.example.mvc.form;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "currentAddress")
public class CurrentAddress{

	@Embedded
    private Address currentAddress;

}
