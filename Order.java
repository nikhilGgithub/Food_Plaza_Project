package com.shoolini.project.dto;

public class Order {
	private int orderid;
	private String id;
	private String foodid;
	private String orderdate;
	private String orderstatus;
	private String price;
	private String quantity;
	public Order(int orderid, String id, String foodid, String orderdate, String orderstatus, String price,
			String quantity) {
		super();
		this.orderid = orderid;
		this.id = id;
		this.foodid = foodid;
		this.orderdate = orderdate;
		this.orderstatus = orderstatus;
		this.price = price;
		this.quantity = quantity;
	}
	public Order(String id, String foodid, String orderdate, String orderstatus, String price, String quantity) {
		super();
		this.id = id;
		this.foodid = foodid;
		this.orderdate = orderdate;
		this.orderstatus = orderstatus;
		this.price = price;
		this.quantity = quantity;
	}
	/**
	 * @return the orderid
	 */
	public int getOrderid() {
		return orderid;
	}
	/**
	 * @param orderid the orderid to set
	 */
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the foodid
	 */
	public String getFoodid() {
		return foodid;
	}
	/**
	 * @param foodid the foodid to set
	 */
	public void setFoodid(String foodid) {
		this.foodid = foodid;
	}
	/**
	 * @return the orderdate
	 */
	public String getOrderdate() {
		return orderdate;
	}
	/**
	 * @param orderdate the orderdate to set
	 */
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	/**
	 * @return the orderstatus
	 */
	public String getOrderstatus() {
		return orderstatus;
	}
	/**
	 * @param orderstatus the orderstatus to set
	 */
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
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
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", id=" + id + ", foodid=" + foodid + ", orderdate=" + orderdate
				+ ", orderstatus=" + orderstatus + ", price=" + price + ", quantity=" + quantity + "]";
	}
	

}
