package com.mdcp.mbc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.mysql.fabric.xmlrpc.base.Data;

@Entity
@Table(name = "SpecialityGuideline")
public class SpecialityGuideline {

	@ManyToOne
	@JoinColumn(name = "categoryid", referencedColumnName = "id")
	private Category categoryid;

	public Category getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Category categoryid) {
		this.categoryid = categoryid;
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String Title;

	@Column(name = "bannerContent", nullable = true, columnDefinition = "text")
	private String bannerContent;

	@Column(name = "shortDescription", nullable = true, columnDefinition = "text")
	private String shortDescription;

	@Column(name = "longDescription", nullable = true, columnDefinition = "text")
	private String longDescription;

	private String imagepath;

	private String uploadDate;

	public int getId() {
		return id;
	}

	public String getTitle() {
		return Title;
	}

	public String getBannerContent() {
		return bannerContent;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public void setBannerContent(String bannerContent) {
		this.bannerContent = bannerContent;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	public String getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}

}