package com.mdcp.mbc.dao;

import java.util.List;

import com.mdcp.mbc.model.SpecialityGuideline;

public interface SpecialityGuidelineDAO {
	public void addSpecialityGuideline(SpecialityGuideline p);
	public void updateSpecialityGuideline(SpecialityGuideline p);
	public List<SpecialityGuideline> listSpecialityGuidelines();
	public SpecialityGuideline getSpecialityGuidelineById(int id);
	public void removeSpecialityGuideline(int id);
}
