package com.mdcp.mbc.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mdcp.mbc.dao.PressReleaseDAO;
import com.mdcp.mbc.model.PressRelease;

public class PressReleaseServiceImpl implements PressReleaseService {

	
	
	private PressReleaseDAO PressReleaseDAOobj;

	
	public void setPressReleaseDAO(PressReleaseDAO PressReleaseDAO){
		
		
		this.PressReleaseDAOobj= PressReleaseDAO;
	}
	
	

	
	
	@Override
	@Transactional
	public void addPressRelease(PressRelease p) {
		// TODO Auto-generated method stub
		this.PressReleaseDAOobj.addPressRelease(p);
	}

	@Override
	@Transactional
	public void updatePressRelease(PressRelease p) {
		// TODO Auto-generated method stub
		this.PressReleaseDAOobj.updatePressRelease(p);
	}

	@Override
	@Transactional
	public List<PressRelease> listPressReleases() {
		// TODO Auto-generated method stub
		return this.PressReleaseDAOobj.listPressReleases();
	}

	@Override
	@Transactional
	public PressRelease getPressReleaseById(int id) {
		// TODO Auto-generated method stub
		return this.PressReleaseDAOobj.getPressReleaseById(id);
	}
	
	@Override
	@Transactional
	public void removePressRelease(int id) {
		// TODO Auto-generated method stub
		this.PressReleaseDAOobj.removePressRelease(id);
	}

}
