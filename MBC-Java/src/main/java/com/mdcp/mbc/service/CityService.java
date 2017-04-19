package com.mdcp.mbc.service;

import java.util.List;

import com.mdcp.mbc.model.City;;

public interface CityService {

	public void addCity(City p);

	public void updateCity(City p);

	public List<City> listCitys();

	public City getCityById(int id);

	public void removeCity(int id);

}
