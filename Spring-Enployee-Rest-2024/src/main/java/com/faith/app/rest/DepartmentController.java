package com.faith.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Department;
import com.faith.app.service.IDepartment;

@CrossOrigin    //to avoid the conflict btwn the tomcat and angular port numbers
@RestController    //it is the compination of @Controller and @Configuration
@RequestMapping("/api")
public class DepartmentController {

	@Autowired
	private IDepartment departmentServices;
	
	@GetMapping("/departments")
	public List<Department> getAllDepartments(){
		return departmentServices.getDepartments();
		
	}
	@PostMapping("/departments")
	public void addDepartment(@RequestBody Department dept) {
		departmentServices.addDepartment(dept);
	}
	//put//delete
	
}

