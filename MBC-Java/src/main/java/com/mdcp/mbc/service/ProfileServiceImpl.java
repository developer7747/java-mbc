package com.mdcp.mbc.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mdcp.mbc.dao.ProfileDAO;
import com.mdcp.mbc.model.Profile;

public class ProfileServiceImpl implements ProfileService {

	private ProfileDAO ProfileDAOobj;

	public void setProfileDAO(ProfileDAO ProfileDAO) {

		this.ProfileDAOobj = ProfileDAO;
	}

	@Override
	@Transactional
	public void addProfile(Profile p) {
		// TODO Auto-generated method stub
		this.ProfileDAOobj.addProfile(p);
	}

	@Override
	@Transactional
	public void updateProfile(Profile p) {
		// TODO Auto-generated method stub
		this.ProfileDAOobj.updateProfile(p);
	}

	@Override
	@Transactional
	public List<Profile> listProfiles() {
		// TODO Auto-generated method stub
		return this.ProfileDAOobj.listProfiles();
	}

	@Override
	@Transactional
	public Profile getProfileById(int id) {
		// TODO Auto-generated method stub
		return this.ProfileDAOobj.getProfileById(id);
	}

	@Override
	@Transactional
	public void removeProfile(int id) {
		// TODO Auto-generated method stub
		this.ProfileDAOobj.removeProfile(id);
	}

}
