package com.example.mvc.form;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class PersonalInfo {
    
    public String name;
    public int StudentAge;
    public String occupation;
    public String position;
    public int monthlyIncome;
    public int yearlyIncome;
    public String landOwned_rent_Rai;
    public int phoneNumber;
}
