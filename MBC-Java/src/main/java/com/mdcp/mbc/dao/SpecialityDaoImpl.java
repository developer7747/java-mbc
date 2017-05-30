package com.mdcp.mbc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mdcp.mbc.dao.SpecialityDAO;
import com.mdcp.mbc.model.Category;
import com.mdcp.mbc.model.Speciality;

public class SpecialityDaoImpl implements SpecialityDAO {

	private static final Logger logger = LoggerFactory.getLogger(SpecialityDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addSpeciality(Speciality p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Speciality saved successfully, Speciality Details=" + p);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Speciality> listSpecialityby()
	{
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Speciality>  SpecialitysList  = session.createQuery("from Speciality").list();
		for (Speciality p : SpecialitysList) {
			logger.info("Speciality List::" + p);
		}
		return SpecialitysList;
	}
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<String> listSpecialitybyString()
	{
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<String>  SpecialitysList  = session.createQuery("select customName from speciality").list();
		for (String p : SpecialitysList) {
			logger.info("Speciality List::" + p);
		}
		return SpecialitysList;
	}
	
	
	
	
	
	
	
	
	

	@Override
	public void updateSpeciality(Speciality p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Speciality updated successfully, Speciality Details=" + p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Speciality> listSpecialitys() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Speciality> SpecialitysList = session.createQuery("from Speciality order by customName").list();
		for (Speciality p : SpecialitysList) {
			logger.info("Speciality List::" + p);
		}
		return SpecialitysList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Speciality> listSpecialitybyName(String spe)
	{
		
		
		
		Session session = this.sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from Speciality where customName = :spe");
		query.setParameter("spe", spe);
		List<Speciality> SpecialitysList = query.list();
		//List<Speciality> SpecialitysList = session.createQuery("from Speciality where name ='"+spe+"").list();
				
		for (Speciality p : SpecialitysList) {
			logger.info("Speciality List::" + p);
		}
		return SpecialitysList;
	}
	
	
	
	
	

	@Override
	public Speciality getSpecialityById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Speciality p = (Speciality) session.load(Speciality.class, new Integer(id));
		logger.info("Speciality loaded successfully, Speciality details=" + p);
		return p;
	}

	@Override
	public void removeSpeciality(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Speciality p = (Speciality) session.load(Speciality.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
		logger.info("Speciality deleted successfully, " + " details=" + p);
	}

}
