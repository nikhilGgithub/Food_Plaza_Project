package com.shoolini.project.service.impl;

import java.util.List;

import com.shoolini.project.dao.UserDao;
import com.shoolini.project.dao.impl.UserDaoImpl;
import com.shoolini.project.dto.User;
import com.shoolini.project.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao = new UserDaoImpl();

	@Override
	public boolean addUser(User user) {
		System.out.println("From UserServiceImpl: "+user);
		boolean isUserAdded = userDao.addUser(user);
		return isUserAdded;
	}

	@Override
	public boolean updateUser(User user) {
		boolean isUserupdated = userDao.updateUser(user);
		return isUserupdated;
		
	}

	@Override
	public boolean deleteUser(String email) {
		boolean deleteUser = userDao.deleteUser(email);
		return deleteUser;
		
	}

	@Override
	public List<User> showAllUser() {
		List<User> allUser = userDao.showAllUser();
		return allUser;
	}

	@Override
	public User searchUser(String email) {
		User searchUser = userDao.searchUser(email);
		return searchUser;
	}

}
