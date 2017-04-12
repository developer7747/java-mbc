package com.mdcp.mbc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
	

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String imagepath;
	private String catname;
	
	@Column(name="customName",nullable = true,columnDefinition = "text")
	private String customName;
	@Column(name="bannerContent",nullable = true,columnDefinition = "text")
	private String bannerContent;
	
	
	
//	@Column(name="createdDate", nullable = true,columnDefinition = "Datetime")
//	private Date  createdDate;
//	
//	@Column(name="modifiedDate", nullable = true,columnDefinition = "Datetime")
//	private Date  modifiedDate;
//	
	@Column(name="catShortDesc",nullable = true,columnDefinition = "text")
	private String catShortDesc;
	
	@Column(name="catDesc", nullable = true,columnDefinition = "text")
	private String catDesc;

//	

	@Column(name="isActive", nullable = true,columnDefinition = "varchar(50)")
	private String  isActive;

	public int getId() {
		return id;
	}

	public String getImagepath() {
		return imagepath;
	}

	public String getCatname() {
		return catname;
	}
//
	public String getCustomName() {
		return customName;
	}
//
//	
//	public Date getModifiedDate() {
//		return modifiedDate;
//	}
//
	public String getCatShortDesc() {
		return catShortDesc;
	}

	public String getCatDesc() {
		return catDesc;
	}
//
	public void setId(int id) {
		this.id = id;
	}
//
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
//
	public void setCatname(String catname) {
		this.catname = catname;
	}
//
	public void setCustomName(String customName) {
		this.customName = customName;
	}
//
//	
//	public void setModifiedDate(Date modifiedDate) {
//		this.modifiedDate = modifiedDate;
//	}
//
	public void setCatShortDesc(String catShortDesc) {
		this.catShortDesc = catShortDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}
//
//	public Date getCreatedDate() {
//		return createdDate;
//	}
//
	public String getIsActive() {
		return isActive;
	}

//	public void setCreatedDate(Date createdDate) {
//		this.createdDate = createdDate;
//	}
//
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getBannerContent() {
		return bannerContent;
	}

	public void setBannerContent(String bannerContent) {
		this.bannerContent = bannerContent;
	}


	
}
