package com.EmployeeERPApplication.entity;



import java.sql.Timestamp;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
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
public class Login {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long login_id;
	private String USERNAME;
	private String PASSWORD;
	private String EMPID;
	private Timestamp DOJ;
	@Column(columnDefinition = "varchar(255) default 'Pending'")
	//@ColumnDefault("'pending'")
	private String STATUS="Pending";
	private String COMPANYMAILID;
	private String DESIGNATION;


}
