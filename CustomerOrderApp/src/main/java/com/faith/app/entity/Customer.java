package com.faith.app.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Customer {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="custNo")
	private Integer custNo;
	
	@Column(name="custRegNo")
	private String custRegNo;
	
	@Column(name="custName",nullable=false,length=60)
	private String custname;
	
	@Column(name="address",nullable=false,length=60)
	private String address;
	
	private boolean isActive;
	
	@OneToMany(mappedBy="customer")
	@JsonBackReference
	private List<Orders> orders;
	
//constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
//getters and setters
	public Integer getCustNo() {
		return custNo;
	}

	public void setCustNo(Integer custNo) {
		this.custNo = custNo;
	}

	public String getCustRegNo() {
		return custRegNo;
	}

	public void setCustRegNo(String custRegNo) {
		this.custRegNo = custRegNo;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
//to string
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custRegNo=" + custRegNo + ", custname=" + custname + ", address="
				+ address + "]";
	}

	
	
	
	
}
