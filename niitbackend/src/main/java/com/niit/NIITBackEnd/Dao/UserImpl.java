package com.niit.NIITBackEnd.Dao;

import java.util.List;

import javax.management.Query;
import javax.transaction.Transactional;

import org.h2.engine.Session;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.NIITBackEnd.model.User;

@Repository
public class UserImpl implements UserDao{

		
private SessionFactory sessionFactory;
@Transactional
public List<User> getUser() {
	@SuppressWarnings("unchecked")
	List<User>userlist=sessionFactory.getCurrentSession().createCriteria(User.class).list();
	return userlist;
}
@Transactional
	public void saveUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
}
/*public boolean loginUser(User user) {
	System.out.println("In Check login");
	Session session = (Session) sessionFactory.openSession();
	boolean userFound = false;
	//Query using Hibernate Query Language
	String SQL_QUERY =" from User as o where o.Username=? and o.Password=?";
	Query query = (Query) ((SharedSessionContract) session).createQuery(SQL_QUERY);
	((org.hibernate.Query) query).setParameter(0,Username);
	((org.hibernate.Query) query).setParameter(1,Password);
	List list = ((org.hibernate.Query) query).list();

	if ((list != null) && (list.size() > 0)) {
		userFound= true;
	}

	session.close();
	return userFound;              
}
	

}
*/