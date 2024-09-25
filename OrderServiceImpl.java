
package com.shoolini.project.service.impl;

import java.util.List;

import com.shoolini.project.dao.OrderDao;
import com.shoolini.project.dao.impl.OrderDaoImpl;
import com.shoolini.project.dto.Order;
import com.shoolini.project.dto.User;
import com.shoolini.project.service.OrderService;

public class OrderServiceImpl implements OrderService {
	private OrderDao orderDao = new OrderDaoImpl();

	@Override
	public boolean addOrder(Order order) {
		System.out.println("From UserServiceImpl: "+order);
		boolean isUserAdded = orderDao.addOrder(order);
		return isUserAdded;
	}

	@Override
	public boolean deleteOrder(String orderid) {
		boolean deleteOrder = orderDao.deleteOrder(orderid);
		return deleteOrder;
			}

	@Override
	public Order searchOrder(String orderid) {
		Order searchOrder = orderDao.searchOrder(orderid);
		return searchOrder;
	}
	
	

}
