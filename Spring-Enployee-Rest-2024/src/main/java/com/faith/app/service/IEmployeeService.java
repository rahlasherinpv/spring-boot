package com.faith.app.service;

import java.util.List;

import com.faith.app.DTO.EmployeeDeptDTO;
import com.faith.app.entity.Employee;

public interface IEmployeeService {

	//list 
	public List<Employee> getEmployee();
	
	//insert 
	public Employee saveEmployee(Employee employee);
	
	//update by id
	public Employee getEmployee(int id);
	
	//delete 
	public void deleteEmployee(int id );
	
	//find by employee name
	public List<Employee> getEmployeeByName(String name);
	
	//innner join 
	public List<EmployeeDeptDTO> getAllDtoEmployees();
	
	
}
