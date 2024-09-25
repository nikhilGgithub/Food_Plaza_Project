package com.shoolini.project.service.impl;
import com.shoolini.project.dao.CartDao;
import com.shoolini.project.dao.impl.CartDaoImpl;
import com.shoolini.project.dto.Cart;

import com.shoolini.project.service.CartService;

public class CartServiceImpl implements CartService{
	private CartDao cartDao = new CartDaoImpl();

	@Override
	public boolean addCart(Cart cart) {
		System.out.println("From CartServiceImpl: "+cart);
		boolean isCartAdded = cartDao.addCart(cart);
		return isCartAdded;
	}
	
	@Override
	public boolean deleteCart(String cartid) {
		boolean deleteUser = cartDao.deleteCart(cartid);
		return deleteUser;
	}


	@Override
	public Cart searchCart(String cardid) {
		Cart searchCart = cartDao.searchCart(cardid);
		return searchCart;
	}


}
