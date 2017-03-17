package com.mdcp.mbc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mdcp.mbc.model.State;;

@Repository
public class StateDAOImpl implements StateDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(StateDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addState(State p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Person saved successfully, Person Details="+p);
	}

	@Override
	public void updateState(State p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Person updated successfully, Person Details="+p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<State> listStates() {
		Session session = this.sessionFactory.getCurrentSession();
		List<State> statesList = session.createQuery("from State").list();
		for(State p : statesList){
			logger.info("Person List::"+p);
		}
		return statesList;
	}

	@Override
	public State getStateById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		State p = (State) session.load(State.class, new Integer(id));
		logger.info("Person loaded successfully, Person details="+p);
		return p;
	}

	@Override
	public void removeState(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		State p = (State) session.load(State.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Person deleted successfully, person details="+p);
	}

}
