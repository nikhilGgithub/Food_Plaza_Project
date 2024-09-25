//package com.shoolini.project.dao.impl;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.List;
//
//import com.shoolini.project.dao.OrderDao;
//import com.shoolini.project.dto.Order;
//import com.shoolini.project.dto.User;
//import com.shoolini.project.utility.DbConnection;
//
//public class OrderDaoImpl implements OrderDao {
//	private Connection con = null;
//	private PreparedStatement ps = null;
//
//	@Override
//	public boolean addOrder(Order order) {
//		System.out.println("From UserDaoImpl: "+order);
//		try {
//			con = DbConnection.getConnection();
//			ps = con.prepareStatement("insert into tbl_order(id,food_id,order_date,order_status,price,quantity) values(?,?,?,?,?,?) ");
//			ps.setString(1, order.getId());
//			ps.setString(2, order.getFoodid());
//			ps.setString(3, order.getOrderdate());
//			ps.setString(4, order.getOrderstatus());
//			ps.setString(5, order.getPrice());
//			ps.setString(6, order.getQuantity());
//			
//			int rows = ps.executeUpdate();
//			if(rows>0) {
//				return true;
//			}else {
//				return false;
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return false;
//		
//	}
//
//	@Override
//	public boolean deleteOrder(String orderid) {
//		try {
//			con = DbConnection.getConnection();
//			ps = con.prepareStatement("delete from tbl_user where order_id=?");
//			ps.setString(1, orderid);
//			int rows = ps.executeUpdate();
//			if(rows>0) {
//				return true;
//			}else {
//				return false;
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return false;
//	}
//
//	@Override
//	public Order searchOrder(String orderid) {
//		try
//		{
//			con = DbConnection.getConnection();
//			ps = con.prepareStatement("select * from tbl_user where order_id=?");
//			ps.setString(1, orderid);
//		ResultSet rs=ps.executeQuery();
//		
//		if(rs.next())
//		{
//			
//			 String id = rs.getString(1);
//			String food_id = rs.getString(2);
//			String order_date = rs.getString(3);
//			String order_status = rs.getString(4);
//			String price = rs.getString(5);
//			String quantity = rs.getString(6);
//			
//			
//			Order order= new Order(id, food_id, order_date, order_status, price,quantity);
//			
//			return order;
//		}
//		
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	
//
//
//}
//
//






package com.shoolini.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.shoolini.project.dao.OrderDao;
import com.shoolini.project.dto.Order;
import com.shoolini.project.utility.DbConnection;

public class OrderDaoImpl implements OrderDao {
    private Connection con = null;
    private PreparedStatement ps = null;

    @Override
    public boolean addOrder(Order order) {
        System.out.println("From UserDaoImpl: " + order);
        try {
            con = DbConnection.getConnection();
            ps = con.prepareStatement("insert into tbl_order(id, food_id, order_date, order_status, price, quantity) values(?,?,?,?,?,?)");
            ps.setString(1, order.getId());
            ps.setString(2, order.getFoodid());
            ps.setString(3, order.getOrderdate());
            ps.setString(4, order.getOrderstatus());
            ps.setString(5, order.getPrice());
            ps.setString(6, order.getQuantity());

            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return false;
    }

    @Override
    public boolean deleteOrder(String orderid) {
        try {
            con = DbConnection.getConnection();
            ps = con.prepareStatement("delete from tbl_order where id=?");
            ps.setString(1, orderid);
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return false;
    }

    @Override
    public Order searchOrder(String orderid) {
        try {
            con = DbConnection.getConnection();
            ps = con.prepareStatement("select * from tbl_order where id=?");
            ps.setString(1, orderid);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String id = rs.getString(1);
                String food_id = rs.getString(2);
                String order_date = rs.getString(3);
                String order_status = rs.getString(4);
                String price = rs.getString(5);
                String quantity = rs.getString(6);

                Order order = new Order(id, food_id, order_date, order_status, price, quantity);
                return order;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return null;
    }
}

