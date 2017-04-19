package com.mdcp.mbc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mdcp.mbc.dao.SpecialityGuidelineDAO;
import com.mdcp.mbc.model.SpecialityGuideline;

public class SpecialityGuidelineDaoImpl implements SpecialityGuidelineDAO {

	private static final Logger logger = LoggerFactory.getLogger(SpecialityGuidelineDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addSpecialityGuideline(SpecialityGuideline p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("SpecialityGuideline saved successfully, SpecialityGuideline Details=" + p);
	}

	@Override
	public void updateSpecialityGuideline(SpecialityGuideline p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("SpecialityGuideline updated successfully, SpecialityGuideline Details=" + p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SpecialityGuideline> listSpecialityGuidelines() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<SpecialityGuideline> SpecialityGuidelinesList = session.createQuery("from SpecialityGuideline").list();
		for (SpecialityGuideline p : SpecialityGuidelinesList) {
			logger.info("SpecialityGuideline List::" + p);
		}
		return SpecialityGuidelinesList;
	}

	@Override
	public SpecialityGuideline getSpecialityGuidelineById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		SpecialityGuideline p = (SpecialityGuideline) session.load(SpecialityGuideline.class, new Integer(id));
		logger.info("SpecialityGuideline loaded successfully, SpecialityGuideline details=" + p);
		return p;
	}

	@Override
	public void removeSpecialityGuideline(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		SpecialityGuideline p = (SpecialityGuideline) session.load(SpecialityGuideline.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
		logger.info("SpecialityGuideline deleted successfully, " + " details=" + p);
	}

}
