package com.faith.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {
//instance variable
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="itemId")
	private Integer itemId;
	
	@Column(name="itemName",nullable=false,length=60)
	private String itemName;
	
	@Column(name="quantity")
	private Integer quantity;
	
	private Integer orderNo;
	@ManyToOne
	@JoinColumn(name="orderNo",insertable=false,updatable=false)
	private Orders order;
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItem(Integer itemId, String itemName, Integer quantity, Integer orderNo, Orders order) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.orderNo = orderNo;
		this.order = order;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "OrderItem [itemId=" + itemId + ", itemName=" + itemName + ", quantity=" + quantity + ", orderNo="
				+ orderNo + ", order=" + order + "]";
	}
	
	
}
