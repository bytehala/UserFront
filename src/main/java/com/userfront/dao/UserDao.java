package com.userfront.dao;

import org.springframework.data.repository.CrudRepository;

import com.userfront.domain.User;


public interface UserDao extends CrudRepository<User, Long>{
	
	// By using this pattern "find + By + Column", spring boot generates the SQL query automagically
	User findByUsername(String username);
	User findByEmail(String email);

}
