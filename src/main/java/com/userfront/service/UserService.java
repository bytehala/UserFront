package com.userfront.service;

import com.userfront.domain.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);

	User findByEmail(String email);

	boolean checkUserExists(String username, String email);

	boolean checkEmailExists(String email);

	boolean checkUserNameExists(String username);

}