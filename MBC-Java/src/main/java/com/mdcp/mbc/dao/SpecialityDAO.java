package com.mdcp.mbc.dao;

import java.util.List;


import com.mdcp.mbc.model.Speciality;

public interface SpecialityDAO 
{
	public void addSpeciality(Speciality p);

	public void updateSpeciality(Speciality p);

	public List<Speciality> listSpecialitys();

	public Speciality getSpecialityById(int id);

	public void removeSpeciality(int id);
	
	public List<Speciality> listSpecialityby();
	
	public List<Speciality> listSpecialitybyName(String spe);

	
	public List<String> listSpecialitybyString();
}
