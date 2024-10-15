package com.example.mvc.form;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DocumentUpload {
	
	private String scholarshipEssay;
	
	private byte[] housePhoto1;
	private byte[] housePhoto2;
	private byte[] housePhoto3;
	private byte[] housePhoto4;
	
	private byte[] familyIncomeCertifiacation;
	
	private byte[] advisorRecommendationLetter;
	
	private byte[] familyStatusCertification;
	
	private byte[] nonParentalGuardianshipCertification;
	
	private String signature;
	private LocalDate date;

}
