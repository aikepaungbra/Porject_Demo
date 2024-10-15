package com.example.mvc.form;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GuardianInfo {

    //Gurdian doesn't have age
    private PersonalInfo guardianInfo;
    private String relationship;
    private int monthlySupport;
    private Address gurdianAddress;
    private WorkAddress gurdianWorkAddress;

}
