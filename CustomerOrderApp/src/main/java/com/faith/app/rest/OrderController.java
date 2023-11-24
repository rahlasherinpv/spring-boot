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

import com.faith.app.dto.CustDto;
import com.faith.app.entity.Orders;
import com.faith.app.service.IOrdersService;

@CrossOrigin    //to avoid the conflict btwn the tomcat and angular port numbers
@RestController    //it is the compination of @Controller and @Configuration
@RequestMapping("/api")
public class OrderController {
	
	@Autowired
	private IOrdersService orderService;
	
	//list of customers
		@GetMapping("/orders")
		public List<Orders> getAllOrder(){
			return orderService.getOrders();
		}
		//add customers
		@PostMapping("/order")
		public void addOrder(@RequestBody Orders order) {
			orderService.addOrder(order);
		}
		//get customer by id
		@GetMapping("/order/{id}")
		public Orders getOrder(@PathVariable int id) {
			return orderService.getOrder(id);
		}
		
		//update customer
		@PutMapping("/order")
		public void updateOrder(@RequestBody Orders order) {
			orderService.addOrder(order);
		}
		
		//delete Customers
		@DeleteMapping("/order/{id}")
		public void deleteOrder(@PathVariable int id) {
			orderService.deleteOrder(id);
			
		}
	
		//inner join
		@GetMapping("/order/dto")
		public List<CustDto> getAllCustDto(){
			return orderService.getAllCustDto();
}
}
