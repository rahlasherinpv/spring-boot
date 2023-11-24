package com.faith.app.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.User;

public interface IUserORepository extends CrudRepository<User, Integer>{
	//cusom method 
	@Query("from User where userName=?1 and password=?2 and isActive=true")
	public User findUserByUserNameAndPassword(String userName,String password);

	
}
