package com.indra.bbva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.indra.bbva.model.CountriesEntity;
import com.indra.bbva.repository.CountriesRepository;

@Service
public class CountriesServiceImpl implements CountriesService{

	
	@Autowired
	private CountriesRepository countriesRepository;
	
	@Override
	@GetMapping("/")
	public List<CountriesEntity> getAllCountries() {
		List<CountriesEntity> countries = countriesRepository.findAll();
		System.out.println(countries);
		return countries;
	}
	
	@Override
	public void saveCountry(CountriesEntity country) {
		this.countriesRepository.save(country);
		System.out.println(country);
	}
	
	@Override
	public CountriesEntity getCountryById(String id) {
		
		Optional<CountriesEntity> optional = countriesRepository.findById(id);
		CountriesEntity country = null;
		if (optional.isPresent()) {
			country = optional.get();
		} else {
			throw new RuntimeException("Country not found for id::  " + id);
		}
		return country;
	}
	
	@Override
	public void deleteCountryById(String id) {
		this.countriesRepository.deleteById(id);
	}
	
	public void listCountriesRegiosn() {
		System.out.println("Hola countries regions");
	}
	
}
