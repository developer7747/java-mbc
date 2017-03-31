package com.mdcp.mbc.service;

import java.util.List;

import com.mdcp.mbc.model.EmrSoftware;

public interface EmrSoftwareService {
	public void addEmrSoftware(EmrSoftware p);
	public void updateEmrSoftware(EmrSoftware p);
	public List<EmrSoftware> listEmrSoftwares();
	public EmrSoftware getEmrSoftwareById(int id);
	public void removeEmrSoftware(int id);
}
