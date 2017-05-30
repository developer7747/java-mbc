package com.mdcp.mbc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "speciality")
public class Speciality {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	

	@Column(name = "catbanner", nullable = true, columnDefinition = "text")
	private String catbanner;
	@Column(name = "bannerContent", nullable = true, columnDefinition = "text")
	private String bannerContent;

	@Column(name = "shortDescription", nullable = true, columnDefinition = "text")
	private String shortDescription;

	@Column(name = "longDescription", nullable = true, columnDefinition = "text")
	private String longDescription;

	@Column(name = "isActive", nullable = true, columnDefinition = "varchar(50)")
	private String isActive;

	// @Column(name="uploadImage", nullable = true,columnDefinition = "text")
	// private String uploadImage;
	
	
	private String imagepath;
	private String catname;

	

	
	
	
	
	
	
	@Column(name = "customName", nullable = true, columnDefinition = "text")
	private String customName;

	@Column(name = "catShortDesc", nullable = true, columnDefinition = "text")
	private String catShortDesc;

	@Column(name = "catDesc", nullable = true, columnDefinition = "text")
	private String catDesc;


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

	// public String getUploadImage() {
	// return uploadImage;
	// }
	//
	// public void setUploadImage(String uploadImage) {
	// this.uploadImage = uploadImage;
	// }

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	public String getCatname() {
		return catname;
	}

	public String getCustomName() {
		return customName;
	}

	public String getCatShortDesc() {
		return catShortDesc;
	}

	public String getCatDesc() {
		return catDesc;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	public void setCatShortDesc(String catShortDesc) {
		this.catShortDesc = catShortDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}

	public String getCatbanner() {
		return catbanner;
	}

	public void setCatbanner(String catbanner) {
		this.catbanner = catbanner;
	}

}
