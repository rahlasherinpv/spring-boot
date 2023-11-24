package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.DTO.EmployeeDeptDTO;
import com.faith.app.common.Validation;
import com.faith.app.entity.Employee;
import com.faith.app.repo.IEmployeeRepository;

@Service
public class EmployeeServiceImplementation implements IEmployeeService {
@Autowired 
Validation validation;
	@Autowired
	private IEmployeeRepository employeerep;

	@Override
	public List<Employee> getEmployee() {
		
		return (List<Employee>) employeerep.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		if (validation.isNameValid(employee.getEmployeeName())) {
			return employeerep.save(employee);
		}
		return null;
	}

	
	@Override
	public Employee getEmployee(int id) {
		
		return employeerep.findById(id).orElseThrow(() -> new RuntimeException("Employee not found for id" + id));
	}

	@Override
	public void deleteEmployee(int id) {
		employeerep.deleteById(id);

	}

	@Override
	public List<Employee> getEmployeeByName(String name) {

		return employeerep.findByEmployeeName(name);
	}

	@Override
	public List<EmployeeDeptDTO> getAllDtoEmployees() {

		return employeerep.findAllDtoEmployees();
	}

}
