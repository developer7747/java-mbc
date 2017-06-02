package com.mdcp.mbc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.mdcp.mbc.model.crm_lead_master;
import com.mdcp.mbc.model.Speciality;

public class LeadMasterDaoImpl implements LeadMasterDAO {

	private static final Logger logger = LoggerFactory.getLogger(LeadMasterDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addcrm_lead_master(crm_lead_master p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("crm_lead_master saved successfully, crm_lead_master Details=" + p);
	}

	@Override
	public void updatecrm_lead_master(crm_lead_master p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("crm_lead_master updated successfully, crm_lead_master Details=" + p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<crm_lead_master> listcrm_lead_masters() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<crm_lead_master> crm_lead_mastersList = session.createQuery("from crm_lead_master").list();
		for (crm_lead_master p : crm_lead_mastersList) {
			logger.info("crm_lead_master List::" + p);
		}
		return crm_lead_mastersList;
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
	public List<crm_lead_master> listcrm_lead_mastersbyName(String art)
	{
		
		Session session = this.sessionFactory.getCurrentSession();
		
		
		Query query = session.createQuery("from crm_lead_master where metaKeyword = :art").setParameter("art", art);
//		query.setFirstResult(0);
//		query.setMaxResults(1); 
		
		List<crm_lead_master> crm_lead_masterList = query.setMaxResults(3).list();
		//List<Speciality> SpecialitysList = session.createQuery("from Speciality where name ='"+spe+"").list();
				
		for (crm_lead_master p : crm_lead_masterList) {
			logger.info("crm_lead_master List::" + p);
		}
		return crm_lead_masterList;
	}
	
	

	
	

	@Override
	public crm_lead_master getcrm_lead_masterById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		crm_lead_master p = (crm_lead_master) session.load(crm_lead_master.class, new Integer(id));
		logger.info("crm_lead_master loaded successfully, crm_lead_master details=" + p);
		return p;
	}

	@Override
	public void removecrm_lead_master(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		crm_lead_master p = (crm_lead_master) session.load(crm_lead_master.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
		logger.info("crm_lead_master deleted successfully, " + " details=" + p);
	}

}
