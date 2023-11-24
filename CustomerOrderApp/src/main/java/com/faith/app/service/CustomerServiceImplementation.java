package com.faith.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.Customer;
import com.faith.app.repo.ICustomerRepository;
@Service
public class CustomerServiceImplementation implements ICustomerService {

	@Autowired
	private ICustomerRepository customerRepository;
	//list customers
	public List<Customer> getcustomers() {
		return (List<Customer>) customerRepository.findAll();
	}
	
	//add customers
	public void addcustomer(Customer cust) {
		customerRepository.save(cust);
		
	}
	
	//get single customers
	public Customer getCustomer(int id) {
		return customerRepository.findById(id).orElseThrow(()->new RuntimeException("customer not found for id" + id));
	}
	
	//delete a customer
    @Transactional
	public void deleteCustomer(int id) {
		customerRepository.disable(id);
		
	}
	//search customer by id
	@Override
	public List<Customer> getAllEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
