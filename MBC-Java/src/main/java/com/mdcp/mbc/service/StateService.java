package com.mdcp.mbc.service;

import java.util.List;

import com.mdcp.mbc.model.State;;

public interface StateService {

	public void addState(State p);
	public void updateState(State p);
	public List<State> listStates();
	public State getStateById(int id);
	public void removeState(int id);
	
}
