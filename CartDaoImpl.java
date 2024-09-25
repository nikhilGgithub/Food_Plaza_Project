package com.shoolini.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.shoolini.project.dao.CartDao;
import com.shoolini.project.dto.Cart;

import com.shoolini.project.utility.DbConnection;

public class CartDaoImpl implements CartDao {
	private Connection con = null;
	private PreparedStatement ps = null;

	@Override
	public boolean addCart(Cart cart) {
		System.out.println("From UserDaoImpl: "+cart);
		try {
			con = DbConnection.getConnection();
			ps = con.prepareStatement("insert into tbl_cart(food_id,id,quantity) values(?,?,?) ");
			ps.setString(1, cart.getFood_id());
			ps.setString(2, cart.getid());
			ps.setString(3, cart.getQuantity());
			
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
	public Cart searchCart(String cartid) {
		try
		{
			con = DbConnection.getConnection();
			ps = con.prepareStatement("select * from tbl_cart where cart_id=?");
			ps.setString(1, cartid);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			
			String food_id = rs.getString(1);
			String id = rs.getString(2);
			String quantity = rs.getString(3);
			
			
			
			Cart cart= new Cart( food_id, id, quantity);
			
			return cart;
		}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;

	}


	@Override
	public boolean deleteCart(String cartid) {
		try {
			con = DbConnection.getConnection();
			ps = con.prepareStatement("delete from tbl_cart where cart_id=?");
			ps.setString(1, cartid);
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


}
