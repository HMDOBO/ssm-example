package com.ssm.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.example.entity.UserEntity;
import com.ssm.example.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public UserEntity getUser() {
		UserEntity user = userService.getUser();
		return user;
	}
	
	

}
