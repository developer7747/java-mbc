package com.mdcp.mbc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author pankaj
 *
 */
@Entity
@Table(name="Emrsoftware")
public class EmrSoftware {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	private String Name;   
	
	private String Logo;
	@Column(name="Logo", insertable=false, updatable=false,nullable = true,columnDefinition = "varchar(50)")
	
	

	
	
	private String Description;
	@Column(name="Description",nullable = true,columnDefinition = "text")
	
	private String RecentRelease;
	@Column(name="RecentRelease",nullable = true,columnDefinition = "text")
	
	private String LatestVersion;
	@Column(name="LatestVersion",nullable = true,columnDefinition = "varchar(50)")
	
	private String Certification;
	@Column(name="Certification",nullable = true,columnDefinition = "varchar(50)")
	
	private String CertificationPeriod;
	@Column(name="CertificationPeriod",nullable = true,columnDefinition = "varchar(50)")
	
	private String Integration;
	@Column(name="Integration",nullable = true,columnDefinition = "varchar(50)")
	
	private String Environmentrequired;
	@Column(name="Environmentrequired",nullable = true,columnDefinition = "varchar(50)")
	
	private String SupportHospitalClaim;
	@Column(name="SupportHospitalClaim",nullable = true,columnDefinition = "varchar(50)")
	
	private String Features;
	@Column(name="Features",nullable = true,columnDefinition = "text")
	
	private String MarketReach;
	@Column(name="MarketReach",nullable = true,columnDefinition = "varchar(50)")
	
//	private boolean isActive;
//	@Column(name="isActive",nullable = true,columnDefinition = "boolean")
	
//	private String CreateDate;
//	@Column(name="CreateDate",nullable = true,columnDefinition = "DateTime")
//	
//	private String ModifiedDate;
//	@Column(name="ModifiedDate",nullable = true,columnDefinition = "DateTime")
	
	private String SpecialtiesId;
	@Column(name="SpecialtiesId",nullable = true,columnDefinition = "int")
	
//	private boolean isPopular;
//	@Column(name="isPopular",nullable = true,columnDefinition = "boolean")
	
	private String CertificationType;
	@Column(name="CertificationType",nullable = true,columnDefinition = "varchar(50)")
	
	private String shortDescription;
	@Column(name="shortDescription",nullable = true,columnDefinition = "text")
	

	public String getLogo() {
		return Logo;
	}

	public void setLogo(String logo) {
		this.Logo = logo;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}

	public String getRecentRelease() {
		return RecentRelease;
	}

	public void setRecentRelease(String recentRelease) {
		this.RecentRelease = recentRelease;
	}

	public String getLatestVersion() {
		return LatestVersion;
	}

	public void setLatestVersion(String latestVersion) {
		this.LatestVersion = latestVersion;
	}

	public String getCertification() {
		return Certification;
	}

	public void setCertification(String certification) {
		this.Certification = certification;
	}

	public String getCertificationPeriod() {
		return CertificationPeriod;
	}

	public void setCertificationPeriod(String certificationPeriod) {
		this.CertificationPeriod = certificationPeriod;
	}

	public String getIntegration() {
		return Integration;
	}

	public void setIntegration(String integration) {
		this.Integration = integration;
	}

	public String getEnvironmentrequired() {
		return Environmentrequired;
	}

	public void setEnvironmentrequired(String environmentrequired) {
		this.Environmentrequired = environmentrequired;
	}

	public String getSupportHospitalClaim() {
		return SupportHospitalClaim;
	}

	public void setSupportHospitalClaim(String supportHospitalClaim) {
		this.SupportHospitalClaim = supportHospitalClaim;
	}

	public String getFeatures() {
		return Features;
	}

	public void setFeatures(String features) {
		this.Features = features;
	}

	public String getMarketReach() {
		return MarketReach;
	}

	public void setMarketReach(String marketReach) {
		this.MarketReach = marketReach;
	}

//	public boolean isActive() {
//		return isActive;
//	}
//
//	public void setActive(boolean isActive) {
//		this.isActive = isActive;
//	}

//	public String getCreateDate() {
//		return CreateDate;
//	}
//
//	public void setCreateDate(String createDate) {
//		this.CreateDate = createDate;
//	}
//
//	public String getModifiedDate() {
//		return ModifiedDate;
//	}
//
//	public void setModifiedDate(String modifiedDate) {
//		this.ModifiedDate = modifiedDate;
//	}

	public String getSpecialtiesId() {
		return SpecialtiesId;
	}

	public void setSpecialtiesId(String specialtiesId) {
		this.SpecialtiesId = specialtiesId;
	}

//	public boolean isPopular() {
//		return isPopular;
//	}
//
//	public void setPopular(boolean isPopular) {
//		this.isPopular = isPopular;
//	}

	public String getCertificationType() {
		return CertificationType;
	}

	public void setCertificationType(String certificationType) {
		this.CertificationType = certificationType;
	}

	
	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	
	
	

	
	
	
	

	
}
