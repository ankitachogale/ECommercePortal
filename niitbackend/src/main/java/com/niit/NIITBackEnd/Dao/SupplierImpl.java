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
import com.niit.NIITBackEnd.model.Supplier;

@SuppressWarnings("unused")
@Repository("SupplierImpl")
public class SupplierImpl implements SupplierDao {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	public SupplierImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	public void save(Supplier s) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(s);
		tx.commit();
		session.flush();
		session.close();
	}
@SuppressWarnings("unused")
	public List<Supplier> list() {
		Session session = this.sessionFactory.openSession();
		List<Supplier> supplierList = session.createQuery("from Supplier").list();
		return supplierList;
	}

	public boolean insertSupplier(Supplier supplier) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.persist(supplier);
		session.getTransaction().commit();
		return true;

	}

	public List<Supplier> retrieve() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<Supplier> list=(List<Supplier>) session.createQuery("from Supplier");
		session.getTransaction().commit();
		return list;
	}
	public boolean updateSupplier(Supplier supplier) {
		Session session = sessionFactory.openSession();
		  Transaction tx = session.beginTransaction();
		  session.saveOrUpdate(supplier);
		  tx.commit();
		  Serializable id = session.getIdentifier(supplier);
		  session.close();
		  return true;
	}
	
	
	public boolean deleteSupplier(Supplier supplier) {
		try
		{
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		return false;
		}
	}
	public Supplier get(int Sid) {
		return (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, Integer.valueOf(Sid));

	}
	public boolean deleteSupplier(int sid) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
