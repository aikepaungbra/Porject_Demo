package com.example.mvc.form;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FatherInfo {

    private PersonalInfo fatherInfo;
    private Address fatherAddress;
    private WorkAddress fatherWorkAddress;


}
