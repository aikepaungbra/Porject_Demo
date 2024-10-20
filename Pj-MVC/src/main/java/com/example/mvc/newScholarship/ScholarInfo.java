package com.example.mvc.newScholarship;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ScholarInfo")
public class ScholarInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String scholar_name;
    private int fund_amount;
    private int given_number;
    private String sponsor;
    private LocalDate scholar_start_date;
    private LocalDate scholar_end_date;
     

}
