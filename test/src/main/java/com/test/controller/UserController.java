package com.test.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.domain.BoardVO;
import com.test.domain.UserVO;
import com.test.mapper.UserMapper;

@Controller
@RequestMapping("/user")
public class UserController
{
//	@Autowired
//	UserMapper userMapper;
//	
//	@Autowired
//	AuthenticationManager authenticationManager;
//	
//	public UserVO login(@RequestBody UserVO userVO, HttpSession session) {
//		String userId = userVO.getUserId();
//		String pw = userVO.getPw();
//		
//		System.out.println("@@@@@@@@@@@@@@@@\nid : "+userId+" / pw : "+pw);
//		
//		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userId, pw);
//		Authentication authentication = authenticationManager.authenticate(token);
//		
//		SecurityContextHolder.getContext().setAuthentication(authentication);
//		
//		session.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, SecurityContextHolder.getContext());
//		
//		UserVO user = userMapper.getUser(userId);
//		user.setToken(session.getId());
//		
//		return user;
//	}
	

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() throws Exception{
		return "login";
	}
}
