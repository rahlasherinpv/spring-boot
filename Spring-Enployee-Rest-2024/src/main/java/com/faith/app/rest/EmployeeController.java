package com.faith.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.DTO.EmployeeDeptDTO;
import com.faith.app.common.APIResponse;
import com.faith.app.entity.Employee;
import com.faith.app.service.IEmployeeService;
import com.faith.app.util.JwtUtil;

@CrossOrigin // to avoid the conflict btwn the tomcat and angular port numbers
@RestController // it is the compination of @Controller and @Configuration
@RequestMapping("/api")
public class EmployeeController {

	@Autowired 
	private IEmployeeService employeeService;
	
	@Autowired 
	private JwtUtil jwtUtil;
	// listing
	@GetMapping("/employees")
	public List<Employee> getEmployee(@RequestHeader(value="Authorization",defaultValue="")String auth) {
		APIResponse apiResponse =new APIResponse();
		
		System.out.println(auth);
		//check jwt tocken 
		//jwtUtil.verify(auth);
		return employeeService.getEmployee();
		
	}

	// get employee by id
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		System.out.println("i m in");
		return employeeService.getEmployee(id);
	}

//	// add emoployee
//	@PostMapping("/employees")
//	public void addemployees(@RequestBody Employee employee) {
//		employeeService.saveEmployee(employee);
//	}
	
	
	@PostMapping("/employees")
	public ResponseEntity<APIResponse> addEmployee(@RequestBody Employee employee) {
	APIResponse apiResponse = new APIResponse();
	if (employeeService.saveEmployee(employee) == null) {
	apiResponse.setData(" name can have only alphabets");
	apiResponse.setStatus(500);
	apiResponse.setError("INVALID NAME");
	return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	}
	apiResponse.setData("Employee data successfully");
	apiResponse.setStatus(200);
	return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

	}

	
	// update employee
	@PutMapping("/employees")
	public void updateemployees(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);

	}
	//delete employee
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}
	
	//search employee by name
	@GetMapping("/employees/search/{name}")
	public List<Employee> getAllEmployeebyName(@PathVariable String name){
		return employeeService.getEmployeeByName(name);
		
	}
	//inner join
	@GetMapping("/employees/dto")
	public List<EmployeeDeptDTO> getAllDTOEmployees(){
		return employeeService.getAllDtoEmployees();
		
	}
}
