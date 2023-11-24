package com.faith.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Customer;
import com.faith.app.service.ICustomerService;

@CrossOrigin    //to avoid the conflict btwn the tomcat and angular port numbers
@RestController    //it is the compination of @Controller and @Configuration
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	
	
	//list of customers
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return customerService.getcustomers();
	}
	//add customers
	@PostMapping("/customer")
	public void addCustomer(@RequestBody Customer cust) {
		customerService.addcustomer(cust);
	}
	//get customer by id
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
	}
	
	//update customer
	@PutMapping("/customer")
	public void updateCustomer(@RequestBody Customer customer) {
		customerService.addcustomer(customer);
	}
	
	//delete Customers
	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
		
	}
	
	//search employee by name
	@GetMapping("/customer/search/{name}")
	public List<Customer> getAllEmployeeByName(@PathVariable String name){
		return customerService.getAllEmployeeByName(name);
	}
}
