package com.shoolini.project.controller;

import java.util.Scanner;

import com.shoolini.project.dto.Order;
import com.shoolini.project.dto.User;
import com.shoolini.project.service.OrderService;
import com.shoolini.project.service.UserService;
import com.shoolini.project.service.impl.OrderServiceImpl;


public class OrderController {

	Scanner s = new Scanner(System.in);
	OrderService orderservice = new OrderServiceImpl();
	public void createOrder() {
		System.out.println("Enter user id");
		String id = s.next();
		System.out.println("Enter food id");
		String foodid = s.next();
		System.out.println("Enter order date");
		String orderdate = s.next();
		System.out.println("Enter order status");
		String orderstatus = s.next();
		System.out.println("Enter price");
		String price = s.next();
		System.out.println("Enter quantity");
		String quantity = s.next();
		Order order = new Order(id, foodid, orderdate, orderstatus,price,quantity);
		boolean isUserCreated = orderservice.addOrder(order);
		if(isUserCreated) {
			System.out.println("User created successfully...");
		}else {
			System.out.println("Something went wrong to create user...");
		}
		
	}
	public Order searchOrder() {
		System.out.println("enter order id to search");
		String orderid=s.next();
		Order searchOrder = orderservice.searchOrder(orderid);
		return searchOrder;
		
	}
	
	public void deleteOrder() {
		System.out.println("enter order id to search");
		String orderid=s.next();
		Order searchOrder = orderservice.searchOrder(orderid);
		boolean isorderdeleted= orderservice.deleteOrder(orderid);
		if(isorderdeleted)
		{
			System.out.println("user deleted..");
		}
		else
		{
			System.out.println("not update errpr..");
		}

		
	}

}
