package com.mdcp.mbc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mdcp.mbc.dao.StateDAO;
import com.mdcp.mbc.model.State;;

@Service
public class StateServiceImpl implements StateService {

	private StateDAO stateDAO;

	public void setStateDAO(StateDAO stateDAO) {
		this.stateDAO = stateDAO;
	}

	@Override
	@Transactional
	public void addState(State p) {
		this.stateDAO.addState(p);
	}

	@Override
	@Transactional
	public void updateState(State p) {
		this.stateDAO.updateState(p);
	}

	@Override
	@Transactional
	public List<State> listStates() {
		return this.stateDAO.listStates();
	}

	@Override
	@Transactional
	public State getStateById(int id) {
		return this.stateDAO.getStateById(id);
	}

	@Override
	@Transactional
	public void removeState(int id) {
		this.stateDAO.removeState(id);
	}

}
