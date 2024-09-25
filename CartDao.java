package com.shoolini.project.dao;

import com.shoolini.project.dto.Cart;

public interface CartDao {
	
    boolean addCart(Cart cart);
	
	boolean deleteCart(String cartid);
	Cart searchCart(String cartid);

}
