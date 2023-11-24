package com.faith.app.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Orders {

//instance variable
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="orderNo")
	private Integer orderNo;
	
	@Column(name="orderDate")
	private LocalDate orderdate;
	
	private Integer custNo;
	@ManyToOne
	@JoinColumn(name="custNo",insertable=false,updatable=false)
	private Customer customer;
	
	
	@OneToMany(mappedBy ="order")
	@JsonBackReference  
	private List<OrderItem> orderItems;
	
	//default constructor
	
	public Orders() {
		super();
		
	}

	//getters and setters

	public Integer getOrderNo() {
		return orderNo;
	}

	
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}



	public LocalDate getOrderdate() {
		return orderdate;
	}



	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}



	public Integer getCustNo() {
		return custNo;
	}



	public void setCustNo(Integer custNo) {
		this.custNo = custNo;
	}


	
	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	 
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}



	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

//to String

	@Override
	public String toString() {
		return "Orders [orderNo=" + orderNo + ", orderdate=" + orderdate + ", custNo=" + custNo + ", customer="
				+ customer + "]";
	}
	
	
	
}
