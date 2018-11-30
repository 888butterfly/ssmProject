package com.mxh.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mxh.ssm.pojo.Nuser;
import com.mxh.ssm.service.UserService;

@Controller
public class UserController {
		@Autowired
	private UserService us;
	
	@RequestMapping(value="mxh.action")
	public void getUserById() {
		System.out.println("进入了此方法");
		Nuser user = us.getUserBuId(2334);
		System.out.println(user.getUsername());
	}
	
	
}
