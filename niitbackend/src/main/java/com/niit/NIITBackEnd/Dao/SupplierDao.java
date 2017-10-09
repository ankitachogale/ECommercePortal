package com.niit.NIITBackEnd.Dao;

import java.util.List;

import com.niit.NIITBackEnd.model.Category;
import com.niit.NIITBackEnd.model.Product;
import com.niit.NIITBackEnd.model.Supplier;


public interface SupplierDao {
	public void save(Supplier s);

	public List<Supplier> list();
	public boolean insertSupplier(Supplier supplier);
	public boolean updateSupplier(Supplier supplier);
	public boolean deleteSupplier(Supplier supplier);
	public Supplier get(int Sid);
}
