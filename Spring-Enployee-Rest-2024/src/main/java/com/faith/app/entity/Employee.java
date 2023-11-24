package com.faith.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
//@Setter @Getter @NoArgsConstructor
@Table(name="employee")
public class Employee {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employeeId")
	private Integer id;
	
	@Column(name="employeeName",nullable=false,length=60)
	private String employeeName;
	
	@Column(name="designation",nullable=false,length=60)
	private String designation;
	
	@Column(name="dateofjoining")
	private LocalDate dateOfJoining;

	private boolean isActive=true;
	
	private Integer departmentId;
	@ManyToOne
	@JoinColumn(name="departmentId",insertable=false,updatable=false)
	private Department department;
	
	//parameterised constructor
	public Employee(Integer id, String employeeName, String designation, LocalDate dateOfJoining, boolean isActive,
			Integer departmentid, Department department) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.designation = designation;
		this.dateOfJoining = dateOfJoining;
		this.isActive = isActive;
		this.departmentId = departmentId;
		this.department = department;
	}
	//to string method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", designation=" + designation
				+ ", dateOfJoining=" + dateOfJoining + ", isActive=" + isActive + ", departmentid=" + departmentId
				+ ", department=" + department + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	@JsonBackReference
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
