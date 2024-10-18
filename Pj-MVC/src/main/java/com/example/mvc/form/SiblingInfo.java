package com.example.mvc.form;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "siblingInfo")
public class SiblingInfo {

    private String siblingName;
    private LocalDate birthday;
    private int age;
    private String occupation;
    private String education;
    private int monthlyIncome;

}
