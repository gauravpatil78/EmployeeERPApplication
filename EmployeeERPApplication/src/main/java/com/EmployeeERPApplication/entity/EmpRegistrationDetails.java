package com.EmployeeERPApplication.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpRegistrationDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String EMPID;
	private String FIRSTNAME;
	private String LASTNAME;
	private String EMAIL;
	private String COMPANYEMAIL;
	private Date DOJ;
	private Date DOB;
	private String GENDER;
	private long MOBNUMBER;
	private String BLOODGROUP;
	private String ADDRESS;
	private String DESIGNATION;
	private String USERNAME;
	
	

}
