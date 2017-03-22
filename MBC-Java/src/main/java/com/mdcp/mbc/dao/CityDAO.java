package com.mdcp.mbc.dao;

import java.util.List;

import com.mdcp.mbc.model.City;

public interface CityDAO {

	public void addCity(City c);
	public void updateCity(City c);
	public List<City> listCitys();
	public City getCityById(int id);
	public void removeCity(int id);
}
