package com.mdcp.mbc.dao;

import java.util.List;

import com.mdcp.mbc.model.Profile;

public interface ProfileDAO {
	public void addProfile(Profile p);

	public void updateProfile(Profile p);

	public List<Profile> listProfiles();

	public Profile getProfileById(int id);

	public void removeProfile(int id);
}
