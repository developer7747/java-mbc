package com.mdcp.mbc.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;


import com.mdcp.mbc.dao.LeadMasterDAO;
import com.mdcp.mbc.model.crm_lead_master;


public class LeadMasterServiceImpl implements LeadMasterService {

	private LeadMasterDAO LeadMasterDAOobj;

	public void setLeadMasterDAO(LeadMasterDAO LeadMasterDAO) {

		this.LeadMasterDAOobj = LeadMasterDAO;
	}

	@Override
	@Transactional
	public void addcrm_lead_master(crm_lead_master p) {
		// TODO Auto-generated method stub
		this.LeadMasterDAOobj.addcrm_lead_master(p);
	}

	@Override
	@Transactional
	public void updatecrm_lead_master(crm_lead_master p) {
		// TODO Auto-generated method stub
		this.LeadMasterDAOobj.updatecrm_lead_master(p);
	}

	@Override
	@Transactional
	public List<crm_lead_master> listcrm_lead_masters() {
		// TODO Auto-generated method stub
		return this.LeadMasterDAOobj.listcrm_lead_masters();
	}
	
	@Override
	@Transactional
	public List<crm_lead_master> listcrm_lead_mastersbyName(String art){
		return this.LeadMasterDAOobj.listcrm_lead_mastersbyName(art);
		
		
	}
	
	
	
	
	
	
	

	@Override
	@Transactional
	public crm_lead_master getcrm_lead_masterById(int id) {
		// TODO Auto-generated method stub
		return this.LeadMasterDAOobj.getcrm_lead_masterById(id);
	}

	@Override
	@Transactional
	public void removecrm_lead_master(int id) {
		// TODO Auto-generated method stub
		this.LeadMasterDAOobj.removecrm_lead_master(id);
	}

}
