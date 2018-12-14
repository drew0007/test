package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.test.domain.UserVO;
import com.test.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserMapper userMapper;

	@Override
	public UserVO getUser(String userId) throws Exception
	{
		return userMapper.getUser(userId);
	}
	
	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException
	{
		UserVO user = userMapper.getUser(userId);
		if(user != null) {
			return user;
		}else {
			return null;
		}		
	}
}
