package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.Department;
import com.faith.app.repo.IDepartmentRepository;
import com.faith.app.repo.IDepartmentRepository;
@Service
public class DepartmentService implements IDepartment {

	@Autowired 
	private IDepartmentRepository departmentRepo;
	
	@Override
	public List<Department> getDepartments() {
		
		return (List<Department>) departmentRepo.findAll();
		
	}

	@Override
	public void addDepartment(Department dept) {
		departmentRepo.save(dept);
		
	}

	
	}


