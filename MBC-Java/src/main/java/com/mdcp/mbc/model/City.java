package com.mdcp.mbc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CITY")
public class City {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	public int getid() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	private String cityName;
	
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
	// End Relations
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Column(name="CityshortDescription",nullable = true,columnDefinition = "text")
	private String CityshortDescription;
	public String getCityshortDescription() {
		return CityshortDescription;
	}

	public void setCityshortDescription(String CityshortDescription) {
		this.CityshortDescription = CityshortDescription;
	}
	
	@Column(name="CitylongDescription", nullable = true,columnDefinition = "text")
	private String CitylongDescription;
	public String getCitylongDescription() {
		return CitylongDescription;
	}

	public void setCitylongDescription(String CitylongDescription) {
		this.CitylongDescription = CitylongDescription;
	}
	
	
	@Column(name="CityZipCode", nullable = true,columnDefinition = "text")
	private String CityZipCode;
	
	public String getCityZipCode() {
		return CityZipCode;
	}

	public void setCityZipCode(String CityZipCode) {
		this.CityZipCode = CityZipCode;
	}
	
//	@Column(name="stateId", nullable = true,columnDefinition = "text")
//	private String stateId;
//	
//	public String getstateId() {
//		return stateId;
//	}
//
//	public void setstateId(String stateId) {
//		this.stateId = stateId;
//	}
	
	
	private String isPopular;
	public String getisPopular() {
		return isPopular;
	}

	public void setisPopular(String isPopular) {
		this.isPopular = isPopular;
	}
	
	
	@Column(name="isActive", nullable = true)
	private String isActive;	
	public String getisActive() {
		return isActive;
	}

	public void setisActive(String isActive) {
		this.isActive = isActive;
	}
	
}
