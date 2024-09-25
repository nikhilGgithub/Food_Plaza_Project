package com.shoolini.project.service;



import com.shoolini.project.dto.Cart;


public interface CartService {
	boolean addCart(Cart cart);
	
	boolean deleteCart(String cartid);
	Cart searchCart(String cardid);
	

}
