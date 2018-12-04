package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.domain.UserVO;
import com.test.service.UserService;

@RestController
public class HelloWorldController
{
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String HelloWorld() {
		return "Hello World";
	}
	
	@RequestMapping(value = "/getuser", method = RequestMethod.GET)
	public String Test() {
		UserVO userVO = userService.getUser("test");
		return userVO.toString();
//		return null;
	}
}
