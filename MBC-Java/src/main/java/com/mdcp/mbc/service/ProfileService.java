package com.mdcp.mbc.service;

import java.util.List;

import com.mdcp.mbc.model.Profile;

public interface ProfileService {
	public void addProfile(Profile p);
	public void updateProfile(Profile p);
	public List<Profile> listProfiles();
	public Profile getProfileById(int id);
	public void removeProfile(int id);
}
