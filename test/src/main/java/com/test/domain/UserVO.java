package com.test.domain;

public class UserVO
{
	private String userId;
	private String pw;
	
	
	public String getUserId()
	{
		return userId;
	}
	public void setUserId(String userId)
	{
		this.userId = userId;
	}
	public String getPw()
	{
		return pw;
	}
	public void setPw(String pw)
	{
		this.pw = pw;
	}
	@Override
	public String toString()
	{
		return "UserVO [userId=" + userId + ", pw=" + pw + "]";
	}
}
