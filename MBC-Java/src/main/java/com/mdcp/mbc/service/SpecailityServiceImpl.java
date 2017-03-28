package com.mdcp.mbc.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mdcp.mbc.dao.SpecialityDAO;
import com.mdcp.mbc.model.Speciality;

public class SpecailityServiceImpl implements SpecialityService {

	
	
	private SpecialityDAO SpecialityDAOobj;

	
	public void setSpecialityDAO(SpecialityDAO SpecialityDAO){
		
		
		this.SpecialityDAOobj= SpecialityDAO;
	}
	
	

	
	
	@Override
	@Transactional
	public void addSpeciality(Speciality p) {
		// TODO Auto-generated method stub
		this.SpecialityDAOobj.addSpeciality(p);
	}

	@Override
	@Transactional
	public void updateSpeciality(Speciality p) {
		// TODO Auto-generated method stub
		this.SpecialityDAOobj.updateSpeciality(p);
	}

	@Override
	@Transactional
	public List<Speciality> listSpecialitys() {
		// TODO Auto-generated method stub
		return this.SpecialityDAOobj.listSpecialitys();
	}

	@Override
	@Transactional
	public Speciality getSpecialityById(int id) {
		// TODO Auto-generated method stub
		return this.SpecialityDAOobj.getSpecialityById(id);
	}
	
	@Override
	@Transactional
	public void removeSpeciality(int id) {
		// TODO Auto-generated method stub
		this.SpecialityDAOobj.removeSpeciality(id);
	}

}
