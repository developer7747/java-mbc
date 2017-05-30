package com.mdcp.mbc.dao;

import java.util.List;

import com.mdcp.mbc.model.infograph;

public interface InfographDAO {

	public void addinfograph(infograph p);

	public void updateinfograph(infograph p);

	public List<infograph> listinfographs();
	
	public List<infograph> listinfog(long page);

	public infograph getinfographById(int id);

	public void removeinfograph(int id);

	public List<infograph> listinfographbyName(String ste);
	
}
