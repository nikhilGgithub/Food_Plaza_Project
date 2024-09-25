package com.shoolini.project.dto;

public class Cart {
	private int cart_id;
	private String food_id;
	private String id;
	private String quantity;
	
	public Cart(int cart_id, String food_id, String id, String quantity) {
		super();
		this.cart_id = cart_id;
		this.food_id = food_id;
		this.id = id;
		this.quantity = quantity;
	}

	public Cart(String food_id, String id, String quantity) {
		super();
		this.food_id = food_id;
		this.id = id;
		this.quantity = quantity;
	}

	/**
	 * @return the cart_id
	 */
	public int getCart_id() {
		return cart_id;
	}

	/**
	 * @param cart_id the cart_id to set
	 */
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	/**
	 * @return the food_id
	 */
	public String getFood_id() {
		return food_id;
	}

	/**
	 * @param food_id the food_id to set
	 */
	public void setFood_id(String food_id) {
		this.food_id = food_id;
	}

	/**
	 * @return the id
	 */
	public String getid() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setid(String id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", food_id=" + food_id + ", id=" + id + ", quantity=" + quantity
				+ "]";
	}
	

}
