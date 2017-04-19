package com.mdcp.mbc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mdcp.mbc.model.City;;

@Repository
public class CityDAOImpl implements CityDAO {

	private static final Logger logger = LoggerFactory.getLogger(CityDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addCity(City p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("City saved successfully, City Details=" + p);
	}

	@Override
	public void updateCity(City p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("City updated successfully, City Details=" + p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<City> listCitys() {
		Session session = this.sessionFactory.getCurrentSession();
		List<City> CitysList = session.createQuery("from City").list();
		for (City p : CitysList) {
			logger.info("City List::" + p);
		}
		return CitysList;
	}

	@Override
	public City getCityById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		City p = (City) session.load(City.class, new Integer(id));
		logger.info("City loaded successfully, City details=" + p);
		return p;
	}

	@Override
	public void removeCity(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		City p = (City) session.load(City.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
		logger.info("City deleted successfully, City details=" + p);
	}

}
