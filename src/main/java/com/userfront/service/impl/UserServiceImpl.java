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
	
	/* (non-Javadoc)
	 * @see com.userfront.service.impl.UserService#saveUser(com.userfront.domain.User)
	 */
	@Override
	public void save(User user) {
		userDao.save(user);
	}
	
	/* (non-Javadoc)
	 * @see com.userfront.service.impl.UserService#findByUsername(java.lang.String)
	 */
	@Override
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
	
	/* (non-Javadoc)
	 * @see com.userfront.service.impl.UserService#findByEmail(java.lang.String)
	 */
	@Override
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}
	
	/* (non-Javadoc)
	 * @see com.userfront.service.impl.UserService#checkUserExists(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean checkUserExists(String username, String email) {
		return checkUserNameExists(username) || checkEmailExists(email);
	}

	/* (non-Javadoc)
	 * @see com.userfront.service.impl.UserService#checkEmailExists(java.lang.String)
	 */
	@Override
	public boolean checkEmailExists(String email) {
		return findByEmail(email) != null;
	}

	/* (non-Javadoc)
	 * @see com.userfront.service.impl.UserService#checkUserNameExists(java.lang.String)
	 */
	@Override
	public boolean checkUserNameExists(String username) {
		return findByUsername(username) != null;
	}

}
