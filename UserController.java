package com.shoolini.project.controller;

import java.util.List;
import java.util.Scanner;

import com.shoolini.project.dto.User;
import com.shoolini.project.service.UserService;
import com.shoolini.project.service.impl.UserServiceImpl;

public class UserController {
	
	Scanner s = new Scanner(System.in);
	UserService userService = new UserServiceImpl();
	
	public void createUser() {
		System.out.println("Enter first name");
		String firstName = s.next();
		System.out.println("Enter last name");
		String lastName = s.next();
		System.out.println("Enter email id");
		String email = s.next();
		System.out.println("Enter password name");
		String pass = s.next();
		User user = new User(firstName, lastName, email, pass);
		boolean isUserCreated = userService.addUser(user);
		if(isUserCreated) {
			System.out.println("User created successfully...");
		}else {
			System.out.println("Something went wrong to create user...");
		}
	}

	public List<User> showall() {
		List<User> allUser= userService.showAllUser();
		return allUser;
	}

	public void updateUser() {
		System.out.println("enter email id to search");
		String email=s.next();
		User user = userService.searchUser(email);
		System.out.println("enter password to update");
		String pass = s.next();
		user.setPassword(pass);
		boolean isuserupdated=userService.updateUser(user);
		if(isuserupdated)
		{
			System.out.println("user updated..");
		}
		else
		{
			System.out.println("not update errpr..");
		}
		
		
	}

	public User searchUser() {
		System.out.println("enter email id to search");
		String email=s.next();
		User searchUser = userService.searchUser(email);
		return searchUser;
		
		
	}

	public void deleteUser() {
		System.out.println("enter email id to search");
		String email=s.next();
		User user = userService.searchUser(email);
		boolean isuserdeleted=userService.deleteUser(email);
		if(isuserdeleted)
		{
			System.out.println("user deleted..");
		}
		else
		{
			System.out.println("not update errpr..");
		}
		
	}

}
