package com.mdcp.mbc.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mdcp.mbc.dao.EmrSoftwareDAO;
import com.mdcp.mbc.model.EmrSoftware;

public class EmrSoftwareServiceImpl implements EmrSoftwareService {

	private EmrSoftwareDAO EmrSoftwareDAOobj;

	public void setEmrSoftwareDAO(EmrSoftwareDAO EmrSoftwareDAO) {

		this.EmrSoftwareDAOobj = EmrSoftwareDAO;
	}

	@Override
	@Transactional
	public void addEmrSoftware(EmrSoftware p) {
		// TODO Auto-generated method stub
		this.EmrSoftwareDAOobj.addEmrSoftware(p);
	}

	@Override
	@Transactional
	public void updateEmrSoftware(EmrSoftware p) {
		// TODO Auto-generated method stub
		this.EmrSoftwareDAOobj.updateEmrSoftware(p);
	}

	@Override
	@Transactional
	public List<EmrSoftware> listEmrSoftwares() {
		// TODO Auto-generated method stub
		return this.EmrSoftwareDAOobj.listEmrSoftwares();
	}

	@Override
	@Transactional
	public EmrSoftware getEmrSoftwareById(int id) {
		// TODO Auto-generated method stub
		return this.EmrSoftwareDAOobj.getEmrSoftwareById(id);
	}

	@Override
	@Transactional
	public void removeEmrSoftware(int id) {
		// TODO Auto-generated method stub
		this.EmrSoftwareDAOobj.removeEmrSoftware(id);
	}

}
