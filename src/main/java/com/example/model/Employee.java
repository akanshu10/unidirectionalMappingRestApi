package com.example.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name =  "employee_testing_unidirectional")
@Data
public class Employee {
	@Id
	private Integer employeeId;
	private String employeeName;
	private String comapanyName;
	private Integer employeeAge;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Department department;
}
