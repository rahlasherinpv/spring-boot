package com.faith.app.service;

import com.faith.app.common.APIResponse;

public interface IUserService {
	//custom method
	//public User findUserByNameAndPassword(String userName ,String password);

	public APIResponse findUserByNameAndPassword(String userName ,String password);
}
