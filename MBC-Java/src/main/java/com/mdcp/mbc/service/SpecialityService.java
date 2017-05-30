package com.mdcp.mbc.service;

import java.util.List;

import com.mdcp.mbc.model.Category;
import com.mdcp.mbc.model.Speciality;

public interface SpecialityService {
	public void addSpeciality(Speciality p);

	public void updateSpeciality(Speciality p);

	public List<Speciality> listSpecialitys();

	public Speciality getSpecialityById(int id);

	public void removeSpeciality(int id);
	
	public List<Speciality> listSpecialitybyName(String spe);
	
	public List<Speciality> listSpecialityby();
	
	
	public List<String> listSpecialitybyString();
}
