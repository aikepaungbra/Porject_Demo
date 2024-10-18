package com.example.mvc.form;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "familyFinancialInfo")
public class FamilyFinancialInfo {

    private int totalFamilyIncome;
    private int totalFamilyExpensive;
    private int totalMontylyDebt;
    
}
