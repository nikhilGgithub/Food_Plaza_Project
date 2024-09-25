package com.shoolini.project.controller;

import java.util.Scanner;

import com.shoolini.project.dto.Cart;

import com.shoolini.project.service.CartService;

import com.shoolini.project.service.impl.CartServiceImpl;


public class CartController {
	Scanner s = new Scanner(System.in);
	CartService cartservice = new CartServiceImpl();

	public void createCart() {
		System.out.println("Enter food id");
		String foodid = s.next();
		System.out.println("Enter user id");
		String id = s.next();
		System.out.println("Enter quantity");
		String quantity = s.next();
		Cart cart = new Cart(foodid, id, quantity);
		boolean isUserCreated = cartservice.addCart(cart);
		if(isUserCreated) {
			System.out.println("User created successfully...");
		}else {
			System.out.println("Something went wrong to create user...");
		}
		
	}

	public void deleteCart() {
		System.out.println("enter cart id to search");
		String cartid=s.next();
		Cart cart = cartservice.searchCart(cartid);
		boolean isuserdeleted=cartservice.deleteCart(cartid);
		if(isuserdeleted)
		{
			System.out.println("user deleted..");
		}
		else
		{
			System.out.println("not update errpr..");
		}
		
	}
		
	 public Cart searchCart()
	 {
		 System.out.println("enter cart id to search");
			String cartid=s.next();
			Cart searchcart = cartservice.searchCart(cartid);
			return searchcart;
	 }

}
