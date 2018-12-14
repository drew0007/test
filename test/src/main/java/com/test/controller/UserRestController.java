package com.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.domain.AuthenticationRequest;
import com.test.domain.UserVO;
import com.test.mapper.UserMapper;

@RestController
@RequestMapping("/user")
public class UserRestController
{
	@Autowired
	UserMapper userMapper;

	@Autowired
	AuthenticationManager authenticationManager;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute("AuthenticationRequest")  AuthenticationRequest authenticationRequest, HttpSession session) throws Exception {

		String userId = authenticationRequest.getUserId();
		String pw = authenticationRequest.getPw();
		
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userId, pw);
		
		System.out.println(token);
		System.out.println("0#####################");
		
		Authentication authentication = authenticationManager.authenticate(token);
		System.out.println("1#####################");
		
//		SecurityContextHolder.getContext().setAuthentication(authentication);
//		System.out.println("2#####################");
//		
//		session.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, SecurityContextHolder.getContext());
//		System.out.println("3#####################");
		
		UserVO user = userMapper.getUser(userId);
		System.out.println("#####################");
		System.out.println(user);
		System.out.println("#####################");
		
		return user.toString();
	}
}
