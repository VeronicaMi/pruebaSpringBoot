package com.indra.bbva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "COUNTRIES")
public class CountriesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "COUNTRY_ID")
	private String countryId;
	
	@Column(name = "COUNTRY_NAME")
	private String countryName;
	
	@Column(name = "REGION_ID")
	private int regionId;

	public CountriesEntity() {}

	public CountriesEntity(String countryId, String countryName, int regionId) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.regionId = regionId;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	@Override
	public String toString() {
		return "CountriesEntity [countryId=" + countryId + ", countryName=" + countryName + ", regionId=" + regionId
				+ "]";
	}
	
	

}
