package com.faith.app.service;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.common.APIResponse;
import com.faith.app.entity.User;
import com.faith.app.repo.IUserORepository;
import com.faith.app.util.JwtUtil;
@Service
public class UserServiceImplimentation implements IUserService {

	@Autowired 
	private IUserORepository userRepository;
	
	@Autowired
	private JwtUtil jwtUtil;
	
//	@Override
//	public User findUserByNameAndPassword(String userName, String password) {
//		User user =userRepository.findUserByUserNameAndPassword(userName, password);
//		return user;
//	}
	
	

	@Override
	public APIResponse findUserByNameAndPassword(String userName, String password) {
		APIResponse apiResponse=new APIResponse();
		//verify user exist or not 
		User user=userRepository.findUserByUserNameAndPassword(userName, password);
		if(user==null) {
			apiResponse.setData("user login failed");
					return apiResponse;
		}
		//creadentials are valid generate a tocken 
		String tocken=jwtUtil.generateJwt(user);
		
		//storing more details and tocken 
		Map<String ,Object> data =new HashMap<String ,Object >();
		data.put("AccessTocken", tocken);
		data.put("role", user.getRoleId());
		data.put("userName", user.getUserName());
		apiResponse.setStatus(200);
		apiResponse.setData(data);
		return apiResponse;
	}
}
