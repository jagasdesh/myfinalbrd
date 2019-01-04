package com.demo.service;

import javax.servlet.http.HttpServletRequest;

import com.demo.entity.User;

public interface LoginService {

	public void saveUser(User user, HttpServletRequest request);

	public User validateUser(User user);

	
}
