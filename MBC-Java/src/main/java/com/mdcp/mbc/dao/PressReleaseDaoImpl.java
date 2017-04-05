package com.mdcp.mbc.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mdcp.mbc.dao.PressReleaseDAO;
import com.mdcp.mbc.model.PressRelease;

public class PressReleaseDaoImpl implements PressReleaseDAO {

	
	
	private static final Logger logger = LoggerFactory.getLogger(PressReleaseDaoImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	
	
	
	
	@Override
	public void addPressRelease(PressRelease p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("PressRelease saved successfully, PressRelease Details="+p);
	}

	@Override
	public void updatePressRelease(PressRelease p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("PressRelease updated successfully, PressRelease Details="+p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PressRelease> listPressReleases() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<PressRelease> PressReleasesList = session.createQuery("from PressRelease").list();
		for(PressRelease p : PressReleasesList){
			logger.info("PressRelease List::"+p);
		}
		return PressReleasesList;
	}

	@Override
	public PressRelease getPressReleaseById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		PressRelease p = (PressRelease) session.load(PressRelease.class, new Integer(id));
		logger.info("PressRelease loaded successfully, PressRelease details="+p);
		return p;
	}

	@Override
	public void removePressRelease(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		PressRelease p = (PressRelease) session.load(PressRelease.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("PressRelease deleted successfully, "
				+ " details="+p);
	}

}
