package com.faith.app.service;

import java.util.List;

import com.faith.app.dto.CustDto;
import com.faith.app.entity.Orders;

public interface IOrdersService {

	List<Orders> getOrders();

	void addOrder(Orders order);

	Orders getOrder(int id);

	

	void deleteOrder(int id);

	

	List<CustDto> getAllCustDto();

}
