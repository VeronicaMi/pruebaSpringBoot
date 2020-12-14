package com.indra.bbva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.indra.bbva.model.RegionsEntity;
import com.indra.bbva.service.RegionsService;

@Controller
public class RegionsController {

	@Autowired
	private RegionsService regionsService;

	@GetMapping("/region")
	public String viewPageRegions(Model model) {
		model.addAttribute("listRegions", regionsService.getAllRegions());
		return "regions";
	}
	
	@GetMapping("/showNewRegion")
	public String showNewRegion(Model model) {
		RegionsEntity region = new RegionsEntity();
		model.addAttribute("region", region);
		System.out.println(region);
		return "new_region";
	}
	
	@PostMapping("/saveRegion")
	public String saveRegion(@ModelAttribute("region") RegionsEntity region) {
		
		regionsService.saveRegion(region);
		
		System.out.println(region);
		return "redirect:/region";
	}
	
	@GetMapping("/updateRegion/{id}")
	public String updateRegion(@PathVariable ( value = "id") long id, Model model) {
		
		// get employee from the service
		RegionsEntity region = regionsService.getRegionById(id);
		System.out.println(region);
		// set employee as a model attribute to pre-populate the form
		model.addAttribute("region", region);
		System.out.println("despues de primer region " + region);
		return "update_region";
	}
	
	@GetMapping("/deleteRegion/{id}")
	public String deleteRegion(@PathVariable (value = "id") long id, Model model) {
		this.regionsService.deleteRegionById(id);
		return "redirect:/region";
	}
	
}
