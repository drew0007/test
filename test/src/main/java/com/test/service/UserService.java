package com.test.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.test.domain.UserVO;

public interface UserService extends UserDetailsService
{
	public UserVO getUser(String userId) throws Exception;
}
