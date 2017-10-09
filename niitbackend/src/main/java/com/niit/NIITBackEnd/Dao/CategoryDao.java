package com.niit.NIITBackEnd.Dao;

import java.util.List;

import com.niit.NIITBackEnd.model.Category;
import com.niit.NIITBackEnd.model.Product;


public interface CategoryDao {
	public void save(Category c);

	public List<Category> list();
	public boolean insertCategory(Category category);
	public Category get(int Cid);
	public int updateCategory(Category category);
	public boolean deleteCategory(Category category);
}
