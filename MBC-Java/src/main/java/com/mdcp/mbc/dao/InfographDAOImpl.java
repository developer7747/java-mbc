package com.mdcp.mbc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import com.mdcp.mbc.model.infograph;;

@Repository
public class InfographDAOImpl implements InfographDAO {

	private static final Logger logger = LoggerFactory.getLogger(InfographDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addinfograph(infograph p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("infograph saved successfully, infograph Details=" + p);
	}

	@Override
	public void updateinfograph(infograph p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("infograph updated successfully, infograph Details=" + p);
	}

	
	
	
	
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<infograph> listinfographbyName(String ste)
	{
		
//		String a = ste;
//		String k  = a.replaceAll("\\s+","");
		
		Session session = this.sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from  infograph where Name = :ste");
		query.setParameter("ste", ste);
		
		List<infograph> inforgraphsList = query.list();;
		
		//List<Speciality> SpecialitysList = session.createQuery("from Speciality where name ='"+spe+"").list();
				
		for (infograph p : inforgraphsList) {
			logger.info("infograph List::" + p);
		}
		return inforgraphsList;
	}
	
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<infograph> listinfographs() {
		Session session = this.sessionFactory.getCurrentSession();
		List<infograph> inforgraphsList = session.createQuery("from infograph  ORDER BY Order DESC ").list();
		
		((Query) session).setFirstResult((int) 2);
		((Query) session).setMaxResults(6);
		
		for (infograph p : inforgraphsList) {
			logger.info("infograph List::" + p);
		}
		return inforgraphsList;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<infograph> listinfog(long page) {
		
		long  s = 2; 
		Session session = this.sessionFactory.getCurrentSession();
		List<infograph> inforgraphsList = session.createQuery("from infograph  ORDER BY Order DESC ").list();
//		((Query) session).setFirstResult((int) s);
		
		
		((Query) session).setFirstResult((int) 2);
		((Query) session).setMaxResults(6);
		
		for (infograph p : inforgraphsList) {
			logger.info("infograph List::" + p);
		}
		return inforgraphsList;
	}

	@Override
	public infograph getinfographById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		infograph p = (infograph) session.load(infograph.class, new Integer(id));
		logger.info("infograph loaded successfully, infograph details=" + p);
		return p;
	}

	
	
	

	
	@Override
	public void removeinfograph(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		infograph p = (infograph) session.load(infograph.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
		logger.info("infograph deleted successfully, infographs details=" + p);
	}

}
