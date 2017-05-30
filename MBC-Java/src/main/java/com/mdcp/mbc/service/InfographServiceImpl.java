package com.mdcp.mbc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mdcp.mbc.dao.InfographDAO;

import com.mdcp.mbc.model.infograph;;

@Service
public class InfographServiceImpl implements InfographService {

	private InfographDAO InfographDAO;

	public void setInfographDAO(InfographDAO InfographDAO) {
		this.InfographDAO = InfographDAO;
	}

	@Override
	@Transactional
	public void addinfograph(infograph p) {
		this.InfographDAO.addinfograph(p);
	}

	@Override
	@Transactional
	public void updateinfograph(infograph p) {
		this.InfographDAO.updateinfograph(p);
	}

	@Override
	@Transactional
	public List<infograph> listinfographs() {
		return this.InfographDAO.listinfographs();
	}
	

	@Override
	@Transactional
	public List<infograph> listinfog(long page){
		return this.InfographDAO.listinfographs();
	}
	
	
	

	@Override
	@Transactional
	public infograph getinfographById(int id) {
		return this.InfographDAO.getinfographById(id);
	}

	@Override
	@Transactional
	public void removeinfograph(int id) {
		this.InfographDAO.removeinfograph(id);
	}

	
	@Override
	@Transactional
	public List<infograph> listinfographbyName(String ste)
	{
		
		return this.InfographDAO.listinfographbyName(ste);
			
		
		
	}
	
	
}
