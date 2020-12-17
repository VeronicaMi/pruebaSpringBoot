package com.indra.bbva.service;

import java.util.List;

import com.indra.bbva.model.CountriesEntity;

public interface CountriesService {
	
	public abstract List<CountriesEntity> getAllCountries();
	public abstract void saveCountry(CountriesEntity country);
	public abstract CountriesEntity getCountryById(String id);
	public abstract void deleteCountryById(String id);
	
	public abstract void listCountriesRegiosn();
}
