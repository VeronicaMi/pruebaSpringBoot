package com.indra.bbva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.indra.bbva.model.EmployeesEntity;
import com.indra.bbva.service.EmployeesService;

@Controller
public class EmployeesController {

	@Autowired
	private EmployeesService employeesService;

	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<EmployeesEntity> listemployes = employeesService.getAllEmployees();
		try {
			
			model.addAttribute("listEmployes", listemployes);
			System.out.println("no hay error de conexion: " + listemployes);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return "index";
	}

	@GetMapping("/showNewEmployee")
	public String showNewEmployee(Model model) {
		EmployeesEntity employee = new EmployeesEntity();
		model.addAttribute("employee", employee);
		return "new_employee";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") EmployeesEntity employee) {
		employeesService.saveEmployee(employee);
		return "redirect:/";
	}

	@GetMapping("/updateEmployee/{id}")
	public String showFormUpdate(@PathVariable(value = "id") long id, Model model) {
		// get employee from service
		EmployeesEntity employee = employeesService.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "update_employee";
	}

	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value = "id") long id) {
		this.employeesService.deleteEmployeeById(id);
		return "redirect:/";
	}
}
