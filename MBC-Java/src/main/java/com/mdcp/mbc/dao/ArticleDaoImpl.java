package com.mdcp.mbc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mdcp.mbc.dao.ArticleDAO;
import com.mdcp.mbc.model.Article;
import com.mdcp.mbc.model.Speciality;

public class ArticleDaoImpl implements ArticleDAO {

	private static final Logger logger = LoggerFactory.getLogger(ArticleDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addArticle(Article p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Article saved successfully, Article Details=" + p);
	}

	@Override
	public void updateArticle(Article p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Article updated successfully, Article Details=" + p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Article> listArticles() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Article> ArticlesList = session.createQuery("from Article").list();
		for (Article p : ArticlesList) {
			logger.info("Article List::" + p);
		}
		return ArticlesList;
	}
	
	
//	
//	public List getByIsActive(boolean isActive) {
//        return  getSession().createQuery(
//                "from User where isActive = :isActive").setParameter("isActive", isActive)
//        .list();
//    }
//	
//	
	@SuppressWarnings("unchecked")
	@Override
	public List<Article> listArticlesbyName(String art)
	{
		
		Session session = this.sessionFactory.getCurrentSession();
		
		
		Query query = session.createQuery("from Article where metaKeyword = :art").setParameter("art", art);
//		query.setFirstResult(0);
//		query.setMaxResults(1); 
		
		List<Article> ArticleList = query.setMaxResults(3).list();
		//List<Speciality> SpecialitysList = session.createQuery("from Speciality where name ='"+spe+"").list();
				
		for (Article p : ArticleList) {
			logger.info("Article List::" + p);
		}
		return ArticleList;
	}
	
	

	
	

	@Override
	public Article getArticleById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Article p = (Article) session.load(Article.class, new Integer(id));
		logger.info("Article loaded successfully, Article details=" + p);
		return p;
	}

	@Override
	public void removeArticle(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Article p = (Article) session.load(Article.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
		logger.info("Article deleted successfully, " + " details=" + p);
	}

}
