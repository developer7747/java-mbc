package com.mdcp.mbc.dao;

import java.util.List;

import com.mdcp.mbc.model.crm_lead_master;


public interface LeadMasterDAO {
	public void addcrm_lead_master(crm_lead_master p);

	public void updatecrm_lead_master(crm_lead_master p);

	public List<crm_lead_master> listcrm_lead_masters();

	public crm_lead_master getcrm_lead_masterById(int id);

	public void removecrm_lead_master(int id);
	
	
	public List<crm_lead_master> listcrm_lead_mastersbyName(String art);
	
	
}
