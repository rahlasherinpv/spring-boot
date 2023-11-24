package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.OrderItem;

public interface IOrderItemRepository extends CrudRepository<OrderItem, Integer>{

}
