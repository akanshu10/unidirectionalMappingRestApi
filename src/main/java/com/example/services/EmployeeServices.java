package com.example.services;

import java.util.List;

import com.example.model.Department;
import com.example.model.Employee;

public interface EmployeeServices {
	
	public boolean addEmployee(Employee employee);
	public Employee getEmployeeByEmployeeId(Integer employeeId);
	public List<Employee> getAllEmployees();
	public Department getDepartmentByEmployeeId(Integer employeeId);
}
