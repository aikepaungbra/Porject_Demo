package com.example.mvc.form;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MotherInfo {

    private PersonalInfo motherInfo;
    private Address motherAddress;
    private WorkAddress motherWorkAddress;

}
