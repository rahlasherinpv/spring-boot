package com.faith.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.faith.app.dto.CustDto;
import com.faith.app.entity.Orders;

public interface IOrderRepository extends CrudRepository<Orders, Integer>{

	@Query("SELECT new com.faith.app.dto.CustDto(c.custRegNo,c.custname,c.address, o.orderdate,t.itemName,t.quantity) FROM Customer c INNER JOIN c.orders o INNER JOIN o.orderItems t ORDER BY o.orderdate")
	List<CustDto> getAllCustDto();

	
	

}
