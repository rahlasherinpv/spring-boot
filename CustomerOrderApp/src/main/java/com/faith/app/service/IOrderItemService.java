package com.faith.app.service;

import java.util.List;

import com.faith.app.entity.OrderItem;



public interface IOrderItemService {

	List<OrderItem> getOrderItems();

	void addOrderItem(OrderItem orderitem);

	OrderItem getOrderItem(int id);

	void deleteOrderItem(int id);

	

}
