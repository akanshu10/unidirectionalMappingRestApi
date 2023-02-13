package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Department;
import com.example.model.Employee;
import com.example.services.DepartmentServices;
import com.example.services.EmployeeServices;

@RestController
public class WebController {
	
	@Autowired
	private EmployeeServices employeeServices;
	@Autowired
	private DepartmentServices departmentServices;
	@PostMapping("/employee")
	public boolean addEmployee(@RequestBody Employee employee) {
		return employeeServices.addEmployee(employee); 
	}
	
	@GetMapping("/employee/{employeeId}")
	public Employee getEmployeeByEmployeeId(@PathVariable("employeeId") Integer employeeId) {
		return employeeServices.getEmployeeByEmployeeId(employeeId);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return employeeServices.getAllEmployees();
	}
	
	@PostMapping("/department")
	public boolean addDepartment(@RequestBody Department department) {
		return departmentServices.addDepartment(department);
	}
	
	@GetMapping("/department/{departmentId}")
	public Department getDepartmentByDepartmentId(@PathVariable("departmentId") Integer departmentId) {
		return departmentServices.getDepartmentByDepartmentId(departmentId);
	}
	
	@GetMapping("/department")
	public List<Department> getAllDepartment(){
		return departmentServices.getAllDepartment();
	}
	
	@GetMapping("/employee/{employeeId}/department")
	public Department getDepartmentByEmployeeId(@PathVariable("employeeId") Integer employeeId) {
		return employeeServices.getDepartmentByEmployeeId(employeeId);
	}
}
