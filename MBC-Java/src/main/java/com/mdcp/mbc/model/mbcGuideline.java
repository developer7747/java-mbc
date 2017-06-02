package com.mdcp.mbc.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.print.attribute.standard.DateTimeAtCompleted;

import com.mysql.fabric.xmlrpc.base.Data;

@Entity
@Table(name = "mbcGuideline")
public class mbcGuideline {

//	@ManyToOne
//	@JoinColumn(name = "categoryid", referencedColumnName = "id")
//	private Category categoryid;
//
//	public Category getCategoryid() {
//		return categoryid;
//	}
//
//	public void setCategoryid(Category categoryid) {
//		this.categoryid = categoryid;
//	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;

	
	private String Guidlelinetitle;

	@Column(name = "spurl", nullable = true, columnDefinition = "text")
	private String spurl;

	@Column(name = "Shortdescription", nullable = true, columnDefinition = "text")
	private String Shortdescription;

	@Column(name = "longDescription", nullable = true, columnDefinition = "text")
	private String longDescription;


	private String spimage;
	
	private	String specialistKeywords;
	private int isActive;
	
	private Date CreateDate;

	private Date ModifiedDate;

	public int getID() {
		return ID;
	}

	public String getGuidlelinetitle() {
		return Guidlelinetitle;
	}

	public String getSpurl() {
		return spurl;
	}

	public String getShortdescription() {
		return Shortdescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public String getSpimage() {
		return spimage;
	}

	public String getSpecialistKeywords() {
		return specialistKeywords;
	}

	public int getIsActive() {
		return isActive;
	}

	public Date getCreateDate() {
		return CreateDate;
	}

	public Date getModifiedDate() {
		return ModifiedDate;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setGuidlelinetitle(String guidlelinetitle) {
		Guidlelinetitle = guidlelinetitle;
	}

	public void setSpurl(String spurl) {
		this.spurl = spurl;
	}

	public void setShortdescription(String shortdescription) {
		Shortdescription = shortdescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public void setSpimage(String spimage) {
		this.spimage = spimage;
	}

	public void setSpecialistKeywords(String specialistKeywords) {
		this.specialistKeywords = specialistKeywords;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		ModifiedDate = modifiedDate;
	}

	
}