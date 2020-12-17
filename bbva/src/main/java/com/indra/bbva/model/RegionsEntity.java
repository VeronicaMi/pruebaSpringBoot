package com.indra.bbva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "REGIONS")
public class RegionsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "REGION_ID")
	private long regionId;
	
	@Column (name = "REGION_NAME")
	private String regionName;

	public RegionsEntity() {}

	public RegionsEntity(long regionId, String regionName) {
		super();
		this.regionId = regionId;
		this.regionName = regionName;
	}

	public long getRegionId() {
		return regionId;
	}

	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Override
	public String toString() {
		return "RegionsEntity [regionId=" + regionId + ", regionName=" + regionName + "]";
	}
	
}
