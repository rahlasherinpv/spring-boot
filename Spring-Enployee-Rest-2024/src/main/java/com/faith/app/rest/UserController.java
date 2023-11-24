package com.faith.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.common.APIResponse;
import com.faith.app.service.IUserService;

@CrossOrigin            // to avoid the conflict btwn the tomcat and angular port numbers
@RestController        // it is the compination of @Controller and @Configuration
@RequestMapping("/api")
public class UserController {
	
	@Autowired 
	private IUserService userService;
	
	
//	@GetMapping("/user/{userName}&{password}")
//	public User findUserByNameandPassword(@PathVariable String userName ,@PathVariable String password ) {
//		return userService.findUserByNameAndPassword(userName, password);
//		
//	}

	@GetMapping("/user/{userName}&{password}")
	public ResponseEntity<APIResponse> findUserByNameandPassword(@PathVariable String userName ,@PathVariable String password ) {
		
		APIResponse apiResponse=userService.findUserByNameAndPassword(userName, password);
		
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		
	}
}
