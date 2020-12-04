package com.indra.bbva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.EmployeesEntity;
import com.indra.bbva.repository.EmployeesRepository;

@Service
public class EmployeesServiceImpl implements EmployeesService{

	@Autowired
	private EmployeesRepository employeesReposirtory;
	
	@Override
	public List<EmployeesEntity> getAllEmployees() {
		List<EmployeesEntity> empleados  = employeesReposirtory.findAll();
		return empleados;
	}

}
