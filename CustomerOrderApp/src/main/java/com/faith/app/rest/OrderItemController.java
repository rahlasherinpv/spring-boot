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

import com.faith.app.entity.OrderItem;
import com.faith.app.entity.Orders;
import com.faith.app.service.IOrderItemService;

@CrossOrigin // to avoid the conflict btwn the tomcat and angular port numbers
@RestController // it is the compination of @Controller and @Configuration
@RequestMapping("/api")
public class OrderItemController {
	@Autowired
	private IOrderItemService orderItemService;

	// list of customers
	@GetMapping("/orderitems")
	public List<OrderItem> getAllOrderItem() {
		return orderItemService.getOrderItems();
	}

	// add customers
	@PostMapping("/orderitem")
	public void addOrderItem(@RequestBody OrderItem orderitem) {
		orderItemService.addOrderItem(orderitem);
	}

	// get customer by id
	@GetMapping("/orderitem/{id}")
	public OrderItem getOrderItem(@PathVariable int id) {
		return orderItemService.getOrderItem(id);
	}

	// update customer
	@PutMapping("/orderitem")
	public void updateOrderItem(@RequestBody OrderItem orderitem) {
		orderItemService.addOrderItem(orderitem);
	}

	// delete Customers
	@DeleteMapping("/orderitem/{id}")
	public void deleteOrderItem(@PathVariable int id) {
		orderItemService.deleteOrderItem(id);

	}
}
