package com.example.mvc.form.scholarshipHistory;

import java.time.LocalDate;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "scholarship_history")
public class ScholarshipHistory {
	

    private boolean scholarBefore;
    private String scholarName;
    private int recieveYear;
    private int scholarAmount;

    private LocalDate loanYearStart;
    private LocalDate loanYearEnd;
    private int loanAmount;

    @Lob
    private String howYouSpendEssay;
    
}
