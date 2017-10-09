package com.niit.NIITBackEnd.Dao;

import java.util.List;

import com.niit.NIITBackEnd.model.Cart;

public interface CartDao {
public boolean addCart(Cart cart);
public boolean updateCart(Cart cart);
public boolean deleteCart(Cart cart);
public Cart getCartItem( int Cartid);
public List<Cart> getCartItems(String Username);


}
