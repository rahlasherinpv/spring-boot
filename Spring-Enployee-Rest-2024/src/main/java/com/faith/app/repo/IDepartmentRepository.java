package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.Department;

public interface IDepartmentRepository extends CrudRepository<Department, Integer>{
	

}
