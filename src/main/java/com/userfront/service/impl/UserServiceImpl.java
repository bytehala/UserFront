package com.userfront.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userfront.dao.UserDao;
import com.userfront.domain.User;
import com.userfront.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void save(User user) {
		userDao.save(user);
	}
	
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
	
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}
	
	public boolean checkUserExists(String username, String email) {
		return checkUserNameExists(username) || checkEmailExists(email);
	}

	public boolean checkEmailExists(String email) {
		return findByEmail(email) == null;
	}

	public boolean checkUserNameExists(String username) {
		return findByUsername(username) == null;
	}

}
