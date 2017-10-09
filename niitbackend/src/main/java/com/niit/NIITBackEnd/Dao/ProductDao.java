package com.niit.NIITBackEnd.Dao;
import java.util.List;

import com.niit.NIITBackEnd.model.Category;
import com.niit.NIITBackEnd.model.Product;


public interface ProductDao {
	public void save(Product p);

	public List<Product> list();
	public boolean insertProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(Product product);
	public Product get(int Pid);

}
