package com.mdcp.mbc.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mdcp.mbc.dao.SpecialityGuidelineDAO;
import com.mdcp.mbc.model.SpecialityGuideline;

public class SpecialityGuidelineServiceImpl implements SpecialityGuidelineService {

	
	
	private SpecialityGuidelineDAO SpecialityGuidelineDAOobj;

	
	public void setSpecialityGuidelineDAO(SpecialityGuidelineDAO SpecialityGuidelineDAO){
		
		
		this.SpecialityGuidelineDAOobj= SpecialityGuidelineDAO;
	}
	
	

	
	
	@Override
	@Transactional
	public void addSpecialityGuideline(SpecialityGuideline p) {
		// TODO Auto-generated method stub
		this.SpecialityGuidelineDAOobj.addSpecialityGuideline(p);
	}

	@Override
	@Transactional
	public void updateSpecialityGuideline(SpecialityGuideline p) {
		// TODO Auto-generated method stub
		this.SpecialityGuidelineDAOobj.updateSpecialityGuideline(p);
	}

	@Override
	@Transactional
	public List<SpecialityGuideline> listSpecialityGuidelines() {
		// TODO Auto-generated method stub
		return this.SpecialityGuidelineDAOobj.listSpecialityGuidelines();
	}

	@Override
	@Transactional
	public SpecialityGuideline getSpecialityGuidelineById(int id) {
		// TODO Auto-generated method stub
		return this.SpecialityGuidelineDAOobj.getSpecialityGuidelineById(id);
	}
	
	@Override
	@Transactional
	public void removeSpecialityGuideline(int id) {
		// TODO Auto-generated method stub
		this.SpecialityGuidelineDAOobj.removeSpecialityGuideline(id);
	}

}
