package com.faith.app.service;

import java.util.List;

import com.faith.app.entity.Department;

public interface IDepartment {
	//List
	public List<Department> getDepartments();

	public void addDepartment(Department dept);

}
