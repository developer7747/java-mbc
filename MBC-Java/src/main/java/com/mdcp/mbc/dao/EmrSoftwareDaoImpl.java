package com.mdcp.mbc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mdcp.mbc.dao.EmrSoftwareDAO;
import com.mdcp.mbc.model.EmrSoftware;

public class EmrSoftwareDaoImpl implements EmrSoftwareDAO {

	private static final Logger logger = LoggerFactory.getLogger(EmrSoftwareDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addEmrSoftware(EmrSoftware p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("EmrSoftware saved successfully, EmrSoftware Details=" + p);
	}

	@Override
	public void updateEmrSoftware(EmrSoftware p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("EmrSoftware updated successfully, EmrSoftware Details=" + p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmrSoftware> listEmrSoftwares() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<EmrSoftware> EmrSoftwaresList = session.createQuery("from EmrSoftware").list();
		for (EmrSoftware p : EmrSoftwaresList) {
			logger.info("EmrSoftware List::" + p);
		}
		return EmrSoftwaresList;
	}

	@Override
	public EmrSoftware getEmrSoftwareById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		EmrSoftware p = (EmrSoftware) session.load(EmrSoftware.class, new Integer(id));
		logger.info("EmrSoftware loaded successfully, EmrSoftware details=" + p);
		return p;
	}

	@Override
	public void removeEmrSoftware(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		EmrSoftware p = (EmrSoftware) session.load(EmrSoftware.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
		logger.info("EmrSoftware deleted successfully, " + " details=" + p);
	}

}
