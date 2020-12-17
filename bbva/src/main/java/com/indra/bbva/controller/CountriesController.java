package com.indra.bbva.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.indra.bbva.model.CountriesEntity;
import com.indra.bbva.model.RegionsEntity;
import com.indra.bbva.service.CountriesService;
import com.indra.bbva.service.RegionsService;

@Controller
public class CountriesController {

	@Autowired
	private CountriesService countriesService;
	@Autowired
	private RegionsService regionsService;

	@GetMapping("/country")
	public String viewPageCountries(Model model) {
		List<CountriesEntity> allCountries = countriesService.getAllCountries();
		model.addAttribute("listCountries", allCountries);
		allCountries.forEach((country)->{
			System.out.println(country);
		});
		return "countries";
	}
	
	@GetMapping("/showNewCountry")
	public String showNewCountry(Model model) {
		CountriesEntity country = new CountriesEntity();
		List<RegionsEntity> listRegions = regionsService.getAllRegions();
		model.addAttribute("country", country);
		model.addAttribute("regions", listRegions);
		System.out.println(country);
		System.out.println("estas son las regiones: " + listRegions);
		return "new_country";
	}
	
	@PostMapping("/saveCountry")
	public String saveCountry(@ModelAttribute("country") CountriesEntity country) {
		
		countriesService.saveCountry(country);
		
		System.out.println(country);
		return "redirect:/country";
	}
	
	@GetMapping("/updateCountry/{id}")
	public String updateCountry(@PathVariable ( value = "id") String id, Model model) {
		
		// get employee from the service
		CountriesEntity country = countriesService.getCountryById(id);
		List<RegionsEntity> listRegions = regionsService.getAllRegions();
		System.out.println(country);
		// set employee as a model attribute to pre-populate the form
		model.addAttribute("country", country);
		model.addAttribute("regions", listRegions);
		System.out.println("despues de primer region " + country + listRegions);
		return "update_country";
	}
	
	@GetMapping("/deleteCountry/{id}")
	public String deleteCountry(@PathVariable (value = "id") String id, Model model) {
		this.countriesService.deleteCountryById(id);
		return "redirect:/country";
	}

	

}
