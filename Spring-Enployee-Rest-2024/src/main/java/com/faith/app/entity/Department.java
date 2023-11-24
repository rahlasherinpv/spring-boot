package com.faith.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Getter @Setter @NoArgsConstructor
public class Department {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="departmentId")
	private Integer departmentId;
	
	@Column(name="departmentName",nullable=false,length=60)
	private String departmentName;

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}