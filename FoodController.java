package com.shoolini.project.controller;

import java.util.List;
import java.util.Scanner;

import com.shoolini.project.dto.Food;
import com.shoolini.project.dto.User;
import com.shoolini.project.service.FoodService;
import com.shoolini.project.service.impl.FoodServiceImpl;

public class FoodController {
	Scanner s = new Scanner(System.in);
	FoodService foodservice = new FoodServiceImpl();
	
	
	public void createfood() {
		System.out.println("Enter food name");
		String foodName = s.next();
		System.out.println("Enter price");
		int  price = s.nextInt();
		System.out.println("Enter quantity");
		String quantity = s.next();
		System.out.println("Enter description");
		String description = s.next();
		Food food = new Food(foodName,price,quantity,description);
		boolean isUserCreated = foodservice.addFood(food);
		if(isUserCreated) {
			System.out.println("Food created successfully...");
		}else {
			System.out.println("Something went wrong to create ...");
		}
	}

	public List<Food> showAll() {
		List<Food> showAllfood = foodservice.showAllfood();
		return showAllfood;
	}

	public void updateFood() {
		System.out.println("enter food name to search");
		String foodName=s.next();
		Food food = foodservice.searchFood(foodName);
		System.out.println("enter the quantity to updtate");
		String quantity = s.next();
		food.setQuantity(quantity);
		boolean isuserupdated=foodservice.updateFood(food);
		if(isuserupdated)
		{
			System.out.println("user updated..");
		}
		else
		{
			System.out.println("not update errpr..");
		}		
		
		
	}


	public Food searchFood() {
		System.out.println("enter food name to search");
		String foodName=s.next();
		Food searchFood = foodservice.searchFood(foodName);
		return searchFood;
	}

	public void deleteFood() {
		System.out.println("enter food name to search");
		String foodName=s.next();
		Food searchFood = foodservice.searchFood(foodName);
		boolean isuserdeleted=foodservice.deleteFood(foodName);
		if(isuserdeleted)
		{
			System.out.println("user deleted..");
		}
		else
		{
			System.out.println("yes...");
		}
		
	}


	
	
	
	

}
