package com.shoolini.project.dao;

import com.shoolini.project.dto.Order;

public interface OrderDao {
	boolean addOrder(Order order);
	boolean deleteOrder(String orderid);
	Order searchOrder(String orderid);

}
