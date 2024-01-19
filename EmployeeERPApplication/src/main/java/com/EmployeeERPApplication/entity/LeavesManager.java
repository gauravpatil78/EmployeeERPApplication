package com.EmployeeERPApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "leaves_manager")
public class LeavesManager {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "emp_id")
	private String empId;
	
	@Column(name = "total_leaves")
	private int totalLeaves;
	
	@Column(name = "seek_leaves")
	private int seekLeaves;
	
	@Column(name = "paid_leaves")
	private int paidLeaves;
	
	@Column(name = "status")
	private String status;
	
	
	
}
