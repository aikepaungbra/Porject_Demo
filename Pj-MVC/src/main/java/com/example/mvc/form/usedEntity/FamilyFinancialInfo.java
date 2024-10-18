package com.example.mvc.form.usedEntity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class FamilyFinancialInfo {

    private int totalFamilyIncome;
    private int totalFamilyExpensive;
    private int totalMontylyDebt;
    
}
