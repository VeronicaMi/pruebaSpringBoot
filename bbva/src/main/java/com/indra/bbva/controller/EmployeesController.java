package com.indra.bbva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.indra.bbva.service.EmployeesService;

@Controller
public class EmployeesController {

	@Autowired
	private EmployeesService employeesService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployes", employeesService.getAllEmployees());
		return "index";
	}
}
