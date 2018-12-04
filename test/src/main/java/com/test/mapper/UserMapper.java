package com.test.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.test.domain.UserVO;

@Mapper
public interface UserMapper
{
	public UserVO getUser(String userId);
}
