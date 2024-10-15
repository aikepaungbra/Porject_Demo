package com.example.mvc.form;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScholarshipHistory {

    private boolean scholarBefore;
    private String ScholarName;
    private int recieveYear;
    private int scholarAmount;

    private LocalDate loanYearStart;
    private LocalDate loanYearEnd;
    private int loanAmount;

    private String howYouSpendEssay;
    
}
