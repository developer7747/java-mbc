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
@Table(name="Articles")
public class Article {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String imagepath;
	private String name;
	
	@Column(name="metaDescription",nullable = true,columnDefinition = "varchar(150)")
	private String metaDescription;
	@Column(name="metaKeyword",nullable = true,columnDefinition = "varchar(150)")
	private String metaKeyword;

	@Column(name="linkurl",nullable = true,columnDefinition = "varchar(250)")
	private String linkurl;

	@Column(name="heading",nullable = true,columnDefinition = "varchar(250)")
	private String heading;
	
//	@Column(name="uploadImage", nullable = true,columnDefinition = "text")
//	private String  uploadImage;
//	
	@Column(name="bannerContent",nullable = true,columnDefinition = "text")
	private String bannerContent;
	
	
	
	@Column(name="shortDescription",nullable = true,columnDefinition = "text")
	private String shortDescription;
	
	@Column(name="longDescription", nullable = true,columnDefinition = "text")
	private String longDescription;
	

	
	@Column(name="pdfupload", nullable = true,columnDefinition = "text")
	private String  pdfupload;
	
	@Column(name="uploaddate", nullable = true,columnDefinition = "Datetime")
	private Date  uploaddate;
	
	
	@Column(name="category", nullable = true,columnDefinition = "varchar(50)")
	private String  category;
	
	@Column(name="speciality", nullable = true,columnDefinition = "varchar(150)")
	private String  speciality;
	

	@Column(name="isActive", nullable = true,columnDefinition = "varchar(50)")
	private String  isActive;

	
	
	//Start Relations
	@ManyToOne
	@JoinColumn(name="stateId",referencedColumnName="id")
	private State state;

	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}
	

	
	
	
	
	
	

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


	public String getMetaDescription() {
		return metaDescription;
	}


	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}


	public String getMetaKeyword() {
		return metaKeyword;
	}


	public void setMetaKeyword(String metaKeyword) {
		this.metaKeyword = metaKeyword;
	}


	public String getLinkurl() {
		return linkurl;
	}


	public void setLinkurl(String linkurl) {
		this.linkurl = linkurl;
	}


	public String getHeading() {
		return heading;
	}


	public void setHeading(String heading) {
		this.heading = heading;
	}


//	public String getUploadImage() {
//		return uploadImage;
//	}
//
//
//	public void setUploadImage(String uploadImage) {
//		this.uploadImage = uploadImage;
//	}
//

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


	public String getLongDescription() {
		return longDescription;
	}


	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}


	public String getPdfupload() {
		return pdfupload;
	}


	public void setPdfupload(String pdfupload) {
		this.pdfupload = pdfupload;
	}


	public Date getUploaddate() {
		return uploaddate;
	}


	public void setUploaddate(Date uploaddate) {
		this.uploaddate = uploaddate;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	public String getIsActive() {
		return isActive;
	}


	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}


	public String getImagepath() {
		return imagepath;
	}


	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}


	
}
