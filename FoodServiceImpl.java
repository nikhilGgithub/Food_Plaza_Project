
package com.shoolini.project.service.impl;

import java.util.List;

import com.shoolini.project.dao.FoodDao;
import com.shoolini.project.dao.impl.FoodDaoImpl;
import com.shoolini.project.dto.Food;
import com.shoolini.project.service.FoodService;

public class FoodServiceImpl implements FoodService{
	
	private FoodDao foodDao =  new FoodDaoImpl();

	@Override
	public boolean addFood(Food food) {
		System.out.println("From FoodServiceImpl: "+food);
		boolean isUserAdded = foodDao.addFood(food);
		return isUserAdded;
	}

	@Override
	public boolean updateFood(Food food) {
		boolean updateFood = foodDao.updateFood(food);
		return updateFood ;
	}

	@Override
	public boolean deleteFood(String foodName) {
		boolean deleteFood = foodDao.deleteFood(foodName);
		return false;
	}

	@Override
	public List<Food> showAllfood() {
		List<Food> showAllfood = foodDao.showAllfood();
		return showAllfood;
	}

	@Override
	public Food searchFood(String foodName) {
		Food searchFood = foodDao.searchFood(foodName);
		return searchFood;
	}

}
