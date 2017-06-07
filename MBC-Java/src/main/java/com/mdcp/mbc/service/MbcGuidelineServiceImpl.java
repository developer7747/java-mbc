package com.mdcp.mbc.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mdcp.mbc.dao.MbcGuidelineDAO;
import com.mdcp.mbc.dao.SpecialityGuidelineDAO;
import com.mdcp.mbc.model.crm_lead_master;
import com.mdcp.mbc.model.mbcGuideline;

public class MbcGuidelineServiceImpl implements MbcGuidelineService {

//	private MbcGuidelineDAO mbcGuidelineDAOobj;
//
//	public void setmbcGuidelineDAO(MbcGuidelineDAO MbcGuidelineDAO) {
//
//		this.mbcGuidelineDAOobj = MbcGuidelineDAO;
//	}

	private MbcGuidelineDAO mbcGuidelineDAOobj;

	public void setMbcGuidelineDAO(MbcGuidelineDAO MbcGuidelineDAO) {

		this.mbcGuidelineDAOobj = MbcGuidelineDAO;
	}

	
	

	
	
	
	
	
	@Override
	@Transactional
	public void addmbcGuideline(mbcGuideline p) {
		// TODO Auto-generated method stub
		this.mbcGuidelineDAOobj.addmbcGuideline(p);
	}

	@Override
	@Transactional
	public void updatembcGuideline(mbcGuideline p) {
		// TODO Auto-generated method stub
		this.mbcGuidelineDAOobj.updatembcGuideline(p);
	}

	@Override
	@Transactional
	public List<mbcGuideline> listmbcGuidelines() {
		// TODO Auto-generated method stub
		return this.mbcGuidelineDAOobj.listmbcGuidelines();
	}

	@Override
	@Transactional
	public List<mbcGuideline> listmbcGuidelinebyName(String art)
	
	{
		
		return this.mbcGuidelineDAOobj.listmbcGuidelinebyName(art);	
		
	}
	


	
	@Override
	@Transactional
	public mbcGuideline getmbcGuidelineById(int id) {
		// TODO Auto-generated method stub
		return this.mbcGuidelineDAOobj.getmbcGuidelineById(id);
	}

	@Override
	@Transactional
	public void removembcGuideline(int id) {
		// TODO Auto-generated method stub
		this.mbcGuidelineDAOobj.removembcGuideline(id);
	}

}
