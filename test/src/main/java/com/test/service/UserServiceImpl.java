package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.domain.UserVO;
import com.test.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserMapper userMapper;
	
	@Override
	public UserVO getUser(String userId) {
		return userMapper.getUser(userId);
	}
}
