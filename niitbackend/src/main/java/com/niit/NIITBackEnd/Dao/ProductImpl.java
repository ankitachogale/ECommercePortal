package com.niit.NIITBackEnd.Dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.niit.NIITBackEnd.model.Category;
import com.niit.NIITBackEnd.model.Person;
import com.niit.NIITBackEnd.model.Product;

public class ProductImpl implements ProductDao{
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
	public void save(Product p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.flush();
		session.close();
	}

	@SuppressWarnings("unchecked")
	public List<Product> list() {
		Session session = this.sessionFactory.openSession();
		List<Product> productList = session.createQuery("from Product").list();
		return productList;
	}
	

	
			 public boolean updateProduct(Product product) {
		  Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  session.saveOrUpdate(product);
		  tx.commit();
		  Serializable id = session.getIdentifier(product);
		  session.close();
		  return true;
		 }
	 

	public boolean insertProduct(Product product) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.persist(product);
		session.getTransaction().commit();
		return true ;	}

	@Transactional
public Product get(int Pid) {
		return (Product) sessionFactory.getCurrentSession().get(Product.class, Integer.valueOf(Pid));
	}

	

	

	public boolean deleteProduct(Product product) {
		try
		{
			sessionFactory.getCurrentSession().delete(deleteProduct(product));
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		return false;
		}	

	}
}
