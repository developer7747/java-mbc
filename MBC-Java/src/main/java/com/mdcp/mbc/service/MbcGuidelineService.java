package com.mdcp.mbc.service;

import java.util.List;

import com.mdcp.mbc.model.mbcGuideline;

public interface MbcGuidelineService {
	public void addmbcGuideline(mbcGuideline p);

	public void updatembcGuideline(mbcGuideline p);

	public List<mbcGuideline> listmbcGuidelines();

	public mbcGuideline getmbcGuidelineById(int id);

	public void removembcGuideline(int id);
	
	public List<mbcGuideline> listmbcGuidelinebyName(String art);
	
}
