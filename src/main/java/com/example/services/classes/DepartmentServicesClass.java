package com.example.services.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DepartmentDao;
import com.example.model.Department;
import com.example.services.DepartmentServices;

@Service
public class DepartmentServicesClass implements DepartmentServices {

	@Autowired
	private DepartmentDao departmentDao;
	
	@Override
	public boolean addDepartment(Department department) {
		System.out.println(department.getDepartmentId());
		System.out.println(department.getDepartmentName());
		departmentDao.save(department);
		return true;
	}

	@Override
	public Department getDepartmentByDepartmentId(Integer departmentId) {
		return departmentDao.findById(departmentId).get();
//		return null;
	}

	@Override
	public List<Department> getAllDepartment() {
		return (List<Department>) departmentDao.findAll();
	}

}
