package com.niit.NIITBackEnd.Dao;

import java.util.List;

import javax.management.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.NIITBackEnd.model.Cart;

@Repository("CartDao")
@Transactional
public class CartImpl implements CartDao{
	@Autowired
	SessionFactory sessionFactory;
	public boolean addCart(Cart cart) {
		try
		{
			
			sessionFactory.getCurrentSession().save(cart);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

	public boolean updateCart(Cart cart) {
		try
		{
			
			sessionFactory.getCurrentSession().saveOrUpdate(cart);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean deleteCart(Cart cart) {
		try
		{
			
			sessionFactory.getCurrentSession().delete(cart);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}	}

	public Cart getCartItem(int Cartid) {
		Session session=sessionFactory.openSession();
		Cart cart=(Cart)session.get(Cart.class,Cartid);
		return null;
	}

	public List<Cart> getCartItems(String Username) {
		Session session=sessionFactory.openSession();
		Query query=(Query) session.createQuery("from Cart where Username=:Username and status='NP'");
		List<Cart> listcartitem=((org.hibernate.Query) query).list();
		return listcartitem;
	}

}
