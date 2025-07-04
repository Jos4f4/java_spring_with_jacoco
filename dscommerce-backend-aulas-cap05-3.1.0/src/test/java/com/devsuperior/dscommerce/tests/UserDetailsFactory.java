package com.devsuperior.dscommerce.tests;

import java.util.ArrayList;
import java.util.List;

import com.devsuperior.dscommerce.projections.UserDetailsProjection;	

public class UserDetailsFactory {
	public static List<UserDetailsProjection> createCustomClientUser(String username){
		List<UserDetailsProjection> list = new ArrayList<>();
		list.add(new UserDetailsImpl(username, "123", 1L, "ROLE_CLIENT"));
		return list;
	}
	
	public static List<UserDetailsProjection> createCustomAdminUser(String username){
		List<UserDetailsProjection> list = new ArrayList<>();
		list.add(new UserDetailsImpl(username, "123", 2L, "ROLE_ADMIN"));
		return list;
	}
	
	public static List<UserDetailsProjection> createCustomAdminClientUser(String username){
		List<UserDetailsProjection> list = new ArrayList<>();
		list.add(new UserDetailsImpl(username, "123", 1L, "ROLE_CLIENT"));
		list.add(new UserDetailsImpl(username, "123", 2L, "ROLE_ADMIN"));
		return list;
	}
}

class UserDetailsImpl implements UserDetailsProjection {
	
	private String username;
	private String password;
	private Long roleId;
	private String authority;
	
	private UserDetailsImpl() {
		
	}

	public UserDetailsImpl(String username, String password, Long roleId, String authority) {
		super();
		this.username = username;
		this.password = password;
		this.roleId = roleId;
		this.authority = authority;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public Long getRoleId() {
		// TODO Auto-generated method stub
		return roleId;
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return authority;
	}
}
