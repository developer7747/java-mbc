package com.mdcp.mbc.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mdcp.mbc.dao.CategoryDAO;
import com.mdcp.mbc.model.Category;
import com.mdcp.mbc.model.Speciality;

public class CategoryServiceImpl implements CategoryService {

	private CategoryDAO CategoryDAOobj;

	public void setCategoryDAO(CategoryDAO CategoryDAO) {

		this.CategoryDAOobj = CategoryDAO;
	}

	@Override
	@Transactional
	public void addCategory(Category p) {
		// TODO Auto-generated method stub
		this.CategoryDAOobj.addCategory(p);
	}

	
	
	
	
	@Override
	@Transactional
	public List<Category> listCategorybyName(String cat)
	{
		
		return this.CategoryDAOobj.listCategorybyName(cat);
		
		
	}

	@Override
	@Transactional
	public void updateCategory(Category p) {
		// TODO Auto-generated method stub
		this.CategoryDAOobj.updateCategory(p);
	}
	

	@Override
	@Transactional
	public List<Category> listCategoryby()
	{
		return this.CategoryDAOobj.listCategorys();
	}
	

	@Override
	@Transactional
	public List<Category> listCategorys() {
		// TODO Auto-generated method stub
		return this.CategoryDAOobj.listCategorys();
	}

	@Override
	@Transactional
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		return this.CategoryDAOobj.getCategoryById(id);
	}

	@Override
	@Transactional
	public void removeCategory(int id) {
		// TODO Auto-generated method stub
		this.CategoryDAOobj.removeCategory(id);
	}

}
