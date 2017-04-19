package com.mdcp.mbc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mdcp.mbc.dao.CategoryDAO;
import com.mdcp.mbc.model.Category;

public class CategoryDaoImpl implements CategoryDAO {

	private static final Logger logger = LoggerFactory.getLogger(CategoryDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addCategory(Category p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Category saved successfully, Category Details=" + p);
	}

	@Override
	public void updateCategory(Category p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Category updated successfully, Category Details=" + p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> listCategorys() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Category> CategorysList = session.createQuery("from Category").list();
		for (Category p : CategorysList) {
			logger.info("Category List::" + p);
		}
		return CategorysList;
	}

	@Override
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Category p = (Category) session.load(Category.class, new Integer(id));
		logger.info("Category loaded successfully, Category details=" + p);
		return p;
	}

	@Override
	public void removeCategory(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Category p = (Category) session.load(Category.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
		logger.info("Category deleted successfully, " + " details=" + p);
	}

}
