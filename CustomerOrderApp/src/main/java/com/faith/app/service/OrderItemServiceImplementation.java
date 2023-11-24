package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.OrderItem;
import com.faith.app.repo.IOrderItemRepository;

@Service
public class OrderItemServiceImplementation implements IOrderItemService {
@Autowired
private IOrderItemRepository orderItemRepository;

	@Override
	public List<OrderItem> getOrderItems() {
		// TODO Auto-generated method stub
		return (List<OrderItem>) orderItemRepository.findAll();
	}

	@Override
	public void addOrderItem(OrderItem orderitem) {
		orderItemRepository.save(orderitem)	;
	}

	@Override
	public OrderItem getOrderItem(int id) {
		// TODO Auto-generated method stub
		return orderItemRepository.findById(id).orElseThrow(()->new RuntimeException("Order item not found for id" + id));
	}

	@Override
	public void deleteOrderItem(int id) {
		orderItemRepository.deleteById(id);
	}



}
