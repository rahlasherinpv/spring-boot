package com.faith.app.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.faith.app.entity.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Integer> {

    //@Query("UPDATE Customer e SET e.isActive = false WHERE e.custNo = :id")
	//void disable(int id);

    
    
  //  @Query(value = "UPDATE customers SET is_active = false WHERE cust_no = :id", nativeQuery = true)
    //void disable(@Param("id") int id);
    
    @Modifying
    @Query("UPDATE Customer c SET c.isActive = false WHERE c.custNo = :id")
    void disable(@Param("id") int id);

}
