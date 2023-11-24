package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dto.CustDto;
import com.faith.app.entity.Orders;
import com.faith.app.repo.IOrderRepository;

@Service
public class OrderServiceImplementation implements IOrdersService {

	@Autowired
	private IOrderRepository orderRepository;
	
	//List
	public List<Orders> getOrders() {
		
		return (List<Orders>) orderRepository.findAll();
	}

	//Add 
	public void addOrder(Orders order) {
		orderRepository.save(order)	;
	}

	//get single order by id
	public Orders getOrder(int id) {
		return orderRepository.findById(id).orElseThrow(()->new RuntimeException("Order not found for id" + id));
	}

	

	//delete Order
	public void deleteOrder(int id) {
		orderRepository.deleteById(id);	
	}

	//innerjoin
	public List<CustDto> getAllCustDto() {
		
		return orderRepository.getAllCustDto();
	}

}
