package com.niit.NIITBackEnd.Dao;

import java.util.List;

import com.niit.NIITBackEnd.model.Product;
import com.niit.NIITBackEnd.model.User;

public interface UserDao {
	public List<User> getUser();
	
	public void saveUser(User user);
/*	public boolean loginUser(User user);
*/
}
