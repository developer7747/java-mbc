package com.mdcp.mbc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mdcp.mbc.dao.MbcGuidelineDAO;

import com.mdcp.mbc.model.mbcGuideline;

public class MbcGuidelineDaoImpl implements MbcGuidelineDAO {

	private static final Logger logger = LoggerFactory.getLogger(MbcGuidelineDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addmbcGuideline(mbcGuideline p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("mbcGuideline saved successfully, mbcGuideline Details=" + p);
	}

	@Override
	public void updatembcGuideline(mbcGuideline p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("mbcGuideline updated successfully, mbcGuideline Details=" + p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<mbcGuideline> listmbcGuidelines() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<mbcGuideline> mbcGuidelinesList = session.createQuery("from mbcGuideline").list();
		for (mbcGuideline p : mbcGuidelinesList) {
			logger.info("mbcGuideline List::" + p);
		}
		return mbcGuidelinesList;
	}

	@Override
	public mbcGuideline getmbcGuidelineById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		mbcGuideline p = (mbcGuideline) session.load(mbcGuideline.class, new Integer(id));
		logger.info("mbcGuideline loaded successfully, mbcGuideline details=" + p);
		return p;
	}

	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<mbcGuideline> listmbcGuidelinebyName(String art)
	{
		
		Session session = this.sessionFactory.getCurrentSession();
		Query query= session.createQuery("from mbcGuideline  where guidlelinetitle = :art").setParameter("art", art);
		
		
		List<mbcGuideline> mbcGuidelinesList =query.setMaxResults(3).list();
		for (mbcGuideline p : mbcGuidelinesList) {
			logger.info("mbcGuideline List::" + p);
		}
		return mbcGuidelinesList;
		

	}
	
	
	
	
	
	@Override
	public void removembcGuideline(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		mbcGuideline p = (mbcGuideline) session.load(mbcGuideline.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
		logger.info("mbcGuideline deleted successfully, " + " details=" + p);
	}

}
