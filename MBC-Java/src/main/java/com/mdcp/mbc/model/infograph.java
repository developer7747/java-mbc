package com.mdcp.mbc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "infograph")
public class infograph {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	

	@Column(name = "Name", nullable = true, columnDefinition = "varchar(500)")
	private String Name;
	
	@Column(name = "ThumbnilImage", nullable = true, columnDefinition = "varchar(500)")
	private String ThumbnilImage;
	
	@Column(name = "Description", nullable = true, columnDefinition = "varchar(500)")
	private String Description;
	
	@Column(name = "Pdffile", nullable = true,insertable = false, updatable = false, columnDefinition = "varchar(500)")
	private String Pdffile;
	
	@Column(name = "Order", nullable = true, columnDefinition = "int(11)")
	private int Order;

	public int getId() {
		return id;
	}

	public String getName() {
		return Name;
	}

	public String getThumbnilImage() {
		return ThumbnilImage;
	}

	public String getDescription() {
		return Description;
	}



	public int getOrder() {
		return Order;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setThumbnilImage(String thumbnilImage) {
		ThumbnilImage = thumbnilImage;
	}

	public void setDescription(String description) {
		Description = description;
	}



	public void setOrder(int order) {
		Order = order;
	}

	public String getPdffile() {
		return Pdffile;
	}

	public void setPdffile(String pdffile) {
		Pdffile = pdffile;
	}
	
	
	
	

}
