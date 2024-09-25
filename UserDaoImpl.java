package com.shoolini.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.shoolini.project.dao.UserDao;
import com.shoolini.project.dto.User;
import com.shoolini.project.utility.DbConnection;

public class UserDaoImpl implements UserDao{
	
	private Connection con = null;
	private PreparedStatement ps = null;

	@Override
	public boolean addUser(User user) {
		System.out.println("From UserDaoImpl: "+user);
		try {
			con = DbConnection.getConnection();
			ps = con.prepareStatement("insert into tbl_user(first_name,last_name,email_id,password) values(?,?,?,?) ");
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			
			int rows = ps.executeUpdate();
			if(rows>0) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		try {
			con = DbConnection.getConnection();
			ps = con.prepareStatement("update tbl_user set email_id=?,first_name=?,last_name=?,password=? where id=?");
			ps.setString(1, user.getEmail());
			ps.setString(2, user.getFirstName());
			ps.setString(3, user.getLastName());
			ps.setString(4, user.getPassword());
			ps.setInt(5, user.getId());
			int rows = ps.executeUpdate();
			if(rows>0) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteUser(String email) {
		try {
			con = DbConnection.getConnection();
			ps = con.prepareStatement("delete from tbl_user where email_id=?");
			ps.setString(1, email);
			int rows = ps.executeUpdate();
			if(rows>0) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

	@Override
	public List<User> showAllUser() {
		try
		{
			con = DbConnection.getConnection();
			ps = con.prepareStatement("select * from tbl_user");
		ResultSet rs=ps.executeQuery();
		List<User> users=new ArrayList<>();
		while(rs.next())
		{
			 int id = rs.getInt("id");
			String first_name = rs.getString("first_name");
			String last_name = rs.getString("last_name");
			String email_id = rs.getString("email_id");
			String password = rs.getString("password");
			
//			int id = rs.getInt(1);
//			String first_name = rs.getString(2);
//			String last_name = rs.getString(3);
//			String email_id = rs.getString(4);
//			String password = rs.getString(5);
			
			
			User user= new User(id, first_name, last_name, email_id, password);
			users.add(user);
			
		}
		return users;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User searchUser(String email) {
		try
		{
			con = DbConnection.getConnection();
			ps = con.prepareStatement("select * from tbl_user where email_id=?");
			ps.setString(1, email);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			
			 int id = rs.getInt(1);
			String first_name = rs.getString(2);
			String last_name = rs.getString(3);
			String email_id = rs.getString(4);
			String password = rs.getString(5);
			
			
			User user= new User(id, first_name, last_name, email_id, password);
			
			return user;
		}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;


	}

}
