package com.niit.NIITBackEnd.Dao;
import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.NIITBackEnd.model.Category;
import com.niit.NIITBackEnd.model.Product;
@SuppressWarnings("unused")
@Repository("CategoryImpl")
public class CategoryImpl implements CategoryDao {
@Autowired
SessionFactory sessionFactory;
@Autowired
public CategoryImpl(SessionFactory sessionFactory){
	this.sessionFactory=sessionFactory;
}
	public void save(Category c) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(c);
		tx.commit();
		session.flush();
		session.close();
			}
	@SuppressWarnings("unused")
	public List<Category> list() {
		Session session = this.sessionFactory.openSession();
		List<Category> categoryList = session.createQuery("from Category").list();
		return categoryList;
	}

	public boolean insertCategory(Category category) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.persist(category);
		session.getTransaction().commit();
		return true ;
	}

	
	public int updateCategory(Category category) {
		 Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  session.saveOrUpdate(category);
		  tx.commit();
		  Serializable id = session.getIdentifier(category);
		  session.close();
		  return (Integer) id;
	}
	public boolean deleteCategory(Category category) {
		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		return false;
		}
	}
	public Category get(int Cid) {
		return (Category) sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(Cid));
		
	}

	

}
