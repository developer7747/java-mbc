package com.mdcp.mbc.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mdcp.mbc.dao.ProfileDAO;
import com.mdcp.mbc.model.Profile;

public class ProfileDaoImpl implements ProfileDAO {

	
	
	private static final Logger logger = LoggerFactory.getLogger(ProfileDaoImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	
	
	
	
	@Override
	public void addProfile(Profile p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Profile saved successfully, Profile Details="+p);
	}

	@Override
	public void updateProfile(Profile p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Profile updated successfully, Profile Details="+p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Profile> listProfiles() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Profile> ProfilesList = session.createQuery("from Profile").list();
		for(Profile p : ProfilesList){
			logger.info("Profile List::"+p);
		}
		return ProfilesList;
	}

	@Override
	public Profile getProfileById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Profile p = (Profile) session.load(Profile.class, new Integer(id));
		logger.info("Profile loaded successfully, Profile details="+p);
		return p;
	}

	@Override
	public void removeProfile(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Profile p = (Profile) session.load(Profile.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Profile deleted successfully, "
				+ " details="+p);
	}

}
