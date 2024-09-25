package com.shoolini.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.shoolini.project.dao.FoodDao;
import com.shoolini.project.dto.Food;
import com.shoolini.project.dto.User;
import com.shoolini.project.utility.DbConnection;

public class FoodDaoImpl implements FoodDao {
	private Connection con = null;
	private PreparedStatement ps = null;

	@Override
	public boolean addFood(Food food) {
		System.out.println("From UserDaoImpl: "+food);
		try {
			con = DbConnection.getConnection();
			ps = con.prepareStatement("insert into tbl_food(food_name,price,quantity,description) values(?,?,?,?) ");
			ps.setString(1, food.getFoodName());
			ps.setInt(2, food.getPrice());
			ps.setString(3, food.getQuantity());
			ps.setString(4, food.getDescription());
			
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
	public boolean updateFood(Food food) {
		try {
			con = DbConnection.getConnection();
			ps = con.prepareStatement("update tbl_food set food_name=?,quantity=?,price=?,description=? where food_id=?");
			ps.setString(1, food.getFoodName());
			ps.setString(2, food.getQuantity());
			ps.setLong(3, food.getPrice());
			ps.setString(4, food.getDescription());
			ps.setInt(5, food.getFood_id());
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
	public boolean deleteFood(String foodName) {
		try {
			con = DbConnection.getConnection();
			ps = con.prepareStatement("delete from tbl_food where food_name=?");
			ps.setString(1, foodName);
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
	public List<Food> showAllfood() {
		try
		{
			con = DbConnection.getConnection();
			ps = con.prepareStatement("select * from tbl_food");
		ResultSet rs=ps.executeQuery();
		List<Food> foods=new ArrayList<>();
		while(rs.next())
		{
			int id = rs.getInt(1);
			String food_name = rs.getString(2);
			int price = rs.getInt(3);
			String quantity = rs.getString(4);
			String description = rs.getString(5);
			
			
			Food food= new Food(id, food_name, price, quantity, description);
			foods.add(food);
			
		}
		return foods;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Food searchFood(String foodName) {
		try
		{
			con = DbConnection.getConnection();
			ps = con.prepareStatement("select * from tbl_food where food_name=?");
			ps.setString(1, foodName);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			
			 int id = rs.getInt(1);
			String food_name = rs.getString(2);
			int price = rs.getInt(3);
			String quantity = rs.getString(4);
			String description = rs.getString(5);
			
			
			Food food= new Food(id, food_name, price, quantity, description);
			
			return food;
		}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
