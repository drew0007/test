package com.test.domain;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserVO implements UserDetails
{
	private static final long serialVersionUID = -980154858244915337L;
	
	private String userId;
	private String pw;
	
	private Collection<? extends GrantedAuthority> authorities;		// 계정이 가지고 있는 권한 목록
	
	private String token;


	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	

	// 사용자에게 부여 된 권한을 리턴
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities()
	{
		return authorities;
	}
	
	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	// 사용자를 인증하는 데 사용되는 암호를 반환
	@Override
	public String getPassword()
	{
		return getPw();
	}

	// 사용자를 인증하는 데 사용되는 사용자 이름 반환
	@Override
	public String getUsername()
	{
		return getUserId();
	}

	// 사용자 계정이 만료되었는지 여부 (true면 만료 x)
	@Override
	public boolean isAccountNonExpired()
	{
		return true;
	}

	// 사용자가 잠겨 있는지 여부 (true면 잠김 x)
	@Override
	public boolean isAccountNonLocked()
	{
		return true;
	}

	// 사용자의 자격 증명(암호)이 만료되었는지 여부 (true면 만료 x)
	@Override
	public boolean isCredentialsNonExpired()
	{
		return true;
	}

	// 사용자의 사용 가능 여부
	@Override
	public boolean isEnabled()
	{
		return true;
	}

	@Override
	public String toString()
	{
		return "UserVO [userId=" + userId + ", pw=" + pw + ", authorities=" + authorities + ", token=" + token + "]";
	}

}
