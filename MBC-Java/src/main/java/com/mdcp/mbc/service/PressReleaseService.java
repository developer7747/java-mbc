package com.mdcp.mbc.service;

import java.util.List;

import com.mdcp.mbc.model.PressRelease;

public interface PressReleaseService {
	public void addPressRelease(PressRelease p);

	public void updatePressRelease(PressRelease p);

	public List<PressRelease> listPressReleases();

	public PressRelease getPressReleaseById(int id);

	public void removePressRelease(int id);
}
