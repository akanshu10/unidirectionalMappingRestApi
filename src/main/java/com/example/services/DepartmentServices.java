package com.example.services;

import java.util.List;

import com.example.model.Department;

public interface DepartmentServices {
	
	public boolean addDepartment(Department department);
	public Department getDepartmentByDepartmentId(Integer departmentId);
	public List<Department> getAllDepartment();
}
