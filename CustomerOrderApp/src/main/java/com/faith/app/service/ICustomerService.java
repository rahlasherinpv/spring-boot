package com.faith.app.service;

import java.util.List;

import com.faith.app.entity.Customer;

public interface ICustomerService {

	List<Customer> getcustomers();

	void addcustomer(Customer cust);

	Customer getCustomer(int id);

	void deleteCustomer(int id);

	List<Customer> getAllEmployeeByName(String name);

	

}
