package com.indra.bbva.service;

import java.util.List;

import com.indra.bbva.model.RegionsEntity;

public interface RegionsService {

	public abstract List<RegionsEntity> getAllRegions();
	public abstract void saveRegion(RegionsEntity region);
	public abstract RegionsEntity getRegionById(long id);
	public abstract void deleteRegionById(long id);
}
