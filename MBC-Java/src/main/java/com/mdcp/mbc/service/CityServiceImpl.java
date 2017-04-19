package com.mdcp.mbc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mdcp.mbc.dao.CityDAO;
import com.mdcp.mbc.model.City;;

@Service
public class CityServiceImpl implements CityService {

	private CityDAO CityDAO;

	public void setCityDAO(CityDAO CityDAO) {
		this.CityDAO = CityDAO;
	}

	@Override
	@Transactional
	public void addCity(City p) {
		this.CityDAO.addCity(p);
	}

	@Override
	@Transactional
	public void updateCity(City p) {
		this.CityDAO.updateCity(p);
	}

	@Override
	@Transactional
	public List<City> listCitys() {
		return this.CityDAO.listCitys();
	}

	@Override
	@Transactional
	public City getCityById(int id) {
		return this.CityDAO.getCityById(id);
	}

	@Override
	@Transactional
	public void removeCity(int id) {
		this.CityDAO.removeCity(id);
	}

}
