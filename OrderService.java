package com.shoolini.project.service;


import com.shoolini.project.dto.Order;

public interface OrderService {
	boolean addOrder(Order order);
	boolean deleteOrder(String orderid);
	Order searchOrder(String orderid);
	

}
