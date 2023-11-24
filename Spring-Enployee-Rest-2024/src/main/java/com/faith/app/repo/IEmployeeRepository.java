package com.faith.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.faith.app.DTO.EmployeeDeptDTO;
import com.faith.app.entity.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {

	//custom method to search name using jpql 
	
	@Query("from Employee where employeeName like %?1%")
	public List <Employee > findByEmployeeName(String Name);
	
	//inner join
	@Query("SELECT new com.faith.app.DTO.EmployeeDeptDTO(e.id,e.employeeName,e.designation,d.departmentName) from Employee e inner join e.department d order by e.id")
	public List<EmployeeDeptDTO> findAllDtoEmployees();
}
