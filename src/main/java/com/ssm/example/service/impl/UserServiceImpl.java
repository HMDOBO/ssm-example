package com.ssm.example.service.impl;

import org.springframework.stereotype.Service;

import com.ssm.example.entity.UserEntity;
import com.ssm.example.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public UserEntity getUser() {
		UserEntity user = new UserEntity();
		user.setId(1);
		user.setUsername("zhangsan");
		user.setPassword("123456");
		return user;
	}

	@Override
	public Integer getValue() {
		return new Integer(100);
	}

	
}
