package com.mdcp.mbc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Speciality")
public class Speciality {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	

	@Column(name="bannerContent",nullable = true,columnDefinition = "text")
	private String bannerContent;
	
	@Column(name="shortDescription",nullable = true,columnDefinition = "text")
	private String shortDescription;
	
	@Column(name="longDescription", nullable = true,columnDefinition = "text")
	private String longDescription;
	

	
	@Column(name="isActive", nullable = true,columnDefinition = "varchar(50)")
	private String  isActive;
	
	
	@Column(name="uploadImage", nullable = true,columnDefinition = "text")
	private String  uploadImage;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getBannerContent() {
		return bannerContent;
	}

	public void setBannerContent(String bannerContent) {
		this.bannerContent = bannerContent;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	
	
	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	


	

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	

	public String getUploadImage() {
		return uploadImage;
	}

	public void setUploadImage(String uploadImage) {
		this.uploadImage = uploadImage;
	}
}
