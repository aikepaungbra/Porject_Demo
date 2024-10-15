package com.example.mvc.form;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SiblingInfo {

    private String siblingName;
    private LocalDate birthday;
    private int age;
    private String occupation;
    private String education;
    private int monthlyIncome;

}
