package com.mdcp.mbc.service;

import java.util.List;

import com.mdcp.mbc.model.Category;
import com.mdcp.mbc.model.Speciality;

public interface CategoryService {
	public void addCategory(Category p);

	public void updateCategory(Category p);

	public List<Category> listCategorys();

	public Category getCategoryById(int id);

	public void removeCategory(int id);
	
	public List<Category> listCategorybyName(String cat);
	
	public List<Category> listCategoryby();
	
}
