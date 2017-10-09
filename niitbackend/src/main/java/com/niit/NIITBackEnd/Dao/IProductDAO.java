package com.niit.NIITBackEnd.Dao;

import java.util.List;
import com.niit.NIITBackEnd.model.Person;

public interface IProductDAO {

	// List<Suppliers> getAllSuppliersList();
	public void save(Person p);

	public List<Person> list();

}
