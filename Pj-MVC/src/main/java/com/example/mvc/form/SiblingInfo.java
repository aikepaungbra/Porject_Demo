package com.example.mvc.form;

import java.time.LocalDate;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class SiblingInfo {

    private String sibling_Name;
    private LocalDate sibling_birthday;
    private int sibling_age;
    private String sibling_occupation;
    private String sibling_education;
    private int sibling_monthlyIncome;

}
