package com.mdcp.mbc.model;

import java.text.DecimalFormat;
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
@Table(name = "Profile")
public class Profile {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "stateid", referencedColumnName = "id")
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State State) {
		this.state = State;
	}

	@ManyToOne
	@JoinColumn(name = "cityid", referencedColumnName = "id")
	private City city;

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@ManyToOne
	@JoinColumn(name = "specialityid", referencedColumnName = "id")
	private Speciality speciality;

	public Speciality getSpeciality() {
		return speciality;
	}

	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}

	private String name;

	private String Billersname;
	// @Column(name="Billersname",insertable=false,updatable=false, nullable =
	// true,columnDefinition = "varchar(150)")

	private String metaDescription;
	@Column(name = "metaDescription", insertable = false, updatable = false, nullable = true, columnDefinition = "varchar(150)")

	private String metaKeyword;
	@Column(name = "metaKeyword", nullable = true, columnDefinition = "varchar(150)")

	// @Column(name="linkurl",nullable = true,columnDefinition = "varchar(250)")
	// private String linkurl;

	private String heading;
	@Column(name = "heading", nullable = true, columnDefinition = "varchar(250)")
	private String bannerContent;
	@Column(name = "bannerContent", nullable = true, columnDefinition = "text")

	private String shortDescription;

	@Column(name = "shortDescription", nullable = true, columnDefinition = "text")

	private String longDescription;
	@Column(name = "longDescription", nullable = true, columnDefinition = "text")

	private String imagepath;

	@Column(name = "ProfileAddress", nullable = true, columnDefinition = "text")
	private String ProfileAddress;

	@Column(name = "PhoneNumber", nullable = true, columnDefinition = "varchar(250)")
	private String PhoneNumber;

	@Column(name = "Email", nullable = true, columnDefinition = "varchar(250)")
	private String Email;

	@Column(name = "Zipcode", nullable = true, columnDefinition = "varchar(250)")
	private String Zipcode;

	@Column(name = "uploaddate", nullable = true, columnDefinition = "Datetime")
	private Date uploaddate;

	@Column(name = "categoryid", nullable = true, columnDefinition = "varchar(50)")
	private String categoryid;

	@Column(name = "isActive", nullable = true, columnDefinition = "varchar(50)")
	private String isActive;

	@Column(name = "Experience", nullable = true, columnDefinition = "text")
	private DecimalFormat Experience;

	@Column(name = "Software", nullable = true, columnDefinition = "text")
	private String Software;

	@Column(name = "Certification", nullable = true, columnDefinition = "text")
	private String Certification;

	@Column(name = "SpecificInterest", nullable = true, columnDefinition = "text")
	private String SpecificInterest;

	@Column(name = "Status", nullable = true, columnDefinition = "text")
	private String Status;

	public String getImagepath() {
		return imagepath;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public String getMetaKeyword() {
		return metaKeyword;
	}

	public String getHeading() {
		return heading;
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

	public String getProfileAddress() {
		return ProfileAddress;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	public String getZipcode() {
		return Zipcode;
	}

	public Date getUploaddate() {
		return uploaddate;
	}

	public String getCategoryid() {
		return categoryid;
	}

	public String getIsActive() {
		return isActive;
	}

	public DecimalFormat getExperience() {
		return Experience;
	}

	public String getSoftware() {
		return Software;
	}

	public String getCertification() {
		return Certification;
	}

	public String getSpecificInterest() {
		return SpecificInterest;
	}

	public String getStatus() {
		return Status;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public void setMetaKeyword(String metaKeyword) {
		this.metaKeyword = metaKeyword;
	}

	public void setHeading(String heading) {
		this.heading = heading;
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

	public void setProfileAddress(String profileAddress) {
		ProfileAddress = profileAddress;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}

	public void setUploaddate(Date uploaddate) {
		this.uploaddate = uploaddate;
	}

	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setExperience(DecimalFormat experience) {
		Experience = experience;
	}

	public void setSoftware(String software) {
		Software = software;
	}

	public void setCertification(String certification) {
		Certification = certification;
	}

	public void setSpecificInterest(String specificInterest) {
		SpecificInterest = specificInterest;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBillersname() {
		return Billersname;
	}

	public void setBillersname(String billersname) {
		Billersname = billersname;
	}
}