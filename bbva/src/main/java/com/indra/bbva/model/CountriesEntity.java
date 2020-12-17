package com.indra.bbva.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "COUNTRIES")
public class CountriesEntity {
	
	@Id
	@Column(name = "COUNTRY_ID")
	private String countryId;
	
	@Column(name = "COUNTRY_NAME")
	private String countryName;
	
	@Column(name = "REGION_ID")
	private long regionId;

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name="REGION_ID", updatable = false, insertable = false)
	private RegionsEntity regions;
	
	public CountriesEntity() {}

	public CountriesEntity(String countryId, String countryName, long regionId, RegionsEntity regions) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.regionId = regionId;
		this.regions = regions;
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

	public long getRegionId() {
		return regionId;
	}

	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}

	public RegionsEntity getRegions() {
		return regions;
	}

	public void setRegions(RegionsEntity regions) {
		this.regions = regions;
	}

	@Override
	public String toString() {
		return "CountriesEntity [countryId=" + countryId + ", countryName=" + countryName + ", regionId=" + regionId
				+ ", regions=" + regions + "]";
	}
	
	
}
