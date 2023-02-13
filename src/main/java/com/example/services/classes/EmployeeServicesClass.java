package com.example.services.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.model.Department;
import com.example.model.Employee;
import com.example.services.EmployeeServices;

@Service
public class EmployeeServicesClass implements EmployeeServices {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public boolean addEmployee(Employee employee) {
		employeeDao.save(employee);
		return false;
	}

	@Override
	public Employee getEmployeeByEmployeeId(Integer employeeId) {
		return employeeDao.findById(employeeId).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeDao.findAll();
	}

	@Override
	public Department getDepartmentByEmployeeId(Integer employeeId) {
		Employee employee = employeeDao.findById(employeeId).get();
		return employee.getDepartment();
	}

}
