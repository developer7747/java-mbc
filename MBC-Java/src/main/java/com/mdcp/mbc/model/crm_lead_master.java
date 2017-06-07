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
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Table(name = "crm_lead_master")
@Entity
public class crm_lead_master {

	@Id
	@Column(name = "Lead_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Lead_ID;


	private String  Practice_Name;
	private String Contact_Name;
	private String Contact_No;
	private String  Contact_No2;
    private String  Ext_No;
    private String  Lead_Type;
    private String  Requirement;
    private int   cityId;
    private int   StateId;
    private int   cateId;
    private String   Occupation;
    private int   isActive;
    private Date  CreateDate;
    private Date    ModifiedDate;
    private String LeadCategory;
    private String SourceURL;
    
   
    private String    Email_ID;
    private String   CityName;
	public int getLead_ID() {
		return Lead_ID;
	}
	public String getPractice_Name() {
		return Practice_Name;
	}
	public String getContact_Name() {
		return Contact_Name;
	}
	public String getContact_No() {
		return Contact_No;
	}
	public String getContact_No2() {
		return Contact_No2;
	}
	public String getExt_No() {
		return Ext_No;
	}
	public String getLead_Type() {
		return Lead_Type;
	}
	public String getRequirement() {
		return Requirement;
	}
	public int getCityId() {
		return cityId;
	}
	public int getStateId() {
		return StateId;
	}
	public int getCateId() {
		return cateId;
	}
	public String getOccupation() {
		return Occupation;
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
	public String getEmail_ID() {
		return Email_ID;
	}
	public String getCityName() {
		return CityName;
	}
	public void setLead_ID(int lead_ID) {
		Lead_ID = lead_ID;
	}
	public void setPractice_Name(String practice_Name) {
		Practice_Name = practice_Name;
	}
	public void setContact_Name(String contact_Name) {
		Contact_Name = contact_Name;
	}
	public void setContact_No(String contact_No) {
		Contact_No = contact_No;
	}
	public void setContact_No2(String contact_No2) {
		Contact_No2 = contact_No2;
	}
	public void setExt_No(String ext_No) {
		Ext_No = ext_No;
	}
	public void setLead_Type(String lead_Type) {
		Lead_Type = lead_Type;
	}
	public void setRequirement(String requirement) {
		Requirement = requirement;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public void setStateId(int stateId) {
		StateId = stateId;
	}
	public void setCateId(int cateId) {
		this.cateId = cateId;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
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
	public void setEmail_ID(String email_ID) {
		Email_ID = email_ID;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public String getLeadCategory() {
		return LeadCategory;
	}
	public String getSourceURL() {
		return SourceURL;
	}
	public void setLeadCategory(String leadCategory) {
		LeadCategory = leadCategory;
	}
	public void setSourceURL(String sourceURL) {
		SourceURL = sourceURL;
	}
	
	
	
	
}