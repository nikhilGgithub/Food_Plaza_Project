package com.shoolini.project.dao;

import java.util.List;

import com.shoolini.project.dto.Food;

public interface FoodDao {
	boolean addFood(Food food);
	boolean updateFood(Food food);
	boolean deleteFood(String foodName);
	List<Food> showAllfood();
	Food searchFood(String foodName);

}
