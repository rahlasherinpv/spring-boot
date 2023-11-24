package com.faith.app.dto;

import java.time.LocalDate;

public class CustDto {

	private String custRegNo;
	private String custname;
	private String address;
	private LocalDate orderdate;
	private String itemName;
	private Integer quantity;
	public CustDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustDto(String custRegNo, String custname, String address, LocalDate orderdate, String itemName,
			Integer quantity) {
		super();
		this.custRegNo = custRegNo;
		this.custname = custname;
		this.address = address;
		this.orderdate = orderdate;
		this.itemName = itemName;
		this.quantity = quantity;
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
	public LocalDate getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
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
	@Override
	public String toString() {
		return "CustDto [custRegNo=" + custRegNo + ", custname=" + custname + ", address=" + address + ", orderdate="
				+ orderdate + ", itemName=" + itemName + ", quantity=" + quantity + "]";
	}
	
	
}
