package com.shoolini.project.dto;

public class Food {
	
	private int food_id;
	private String foodName;
	private int price;
	private String quantity;
	private String description;
	
	public Food(int food_id, String foodName, int price, String quantity, String description) {
		super();
		this.food_id = food_id;
		this.foodName = foodName;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}

	public Food(String foodName, int price, String quantity, String description) {
		super();
		this.foodName = foodName;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}

	/**
	 * @return the food_id
	 */
	public int getFood_id() {
		return food_id;
	}

	/**
	 * @param food_id the food_id to set
	 */
	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}

	/**
	 * @return the foodName
	 */
	public String getFoodName() {
		return foodName;
	}

	/**
	 * @param foodName the foodName to set
	 */
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Food [food_id=" + food_id + ", foodName=" + foodName + ", price=" + price + ", quantity=" + quantity
				+ ", description=" + description + "]";
	}
	
	
	
	
	
	

}
