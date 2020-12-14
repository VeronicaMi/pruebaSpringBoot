package com.indra.bbva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.indra.bbva.model.EmployeesEntity;
import com.indra.bbva.repository.EmployeesRepository;

@Service
public class EmployeesServiceImpl implements EmployeesService {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private EmployeesRepository employeesRepository;

	public EmployeesServiceImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Override
	@GetMapping("/")
	public List<EmployeesEntity> getAllEmployees() {
		String sql = "SELECT * FROM EMPLOYEES";
		List<EmployeesEntity> empleados = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(EmployeesEntity.class));
		//List<EmployeesEntity> empleados2 = employeesRepository.findAll();
		
		return empleados;
	}

	@Override
	public void saveEmployee(EmployeesEntity employees) {
		this.employeesRepository.save(employees);
	}

	@Override
	public EmployeesEntity getEmployeeById(long id) {
		Optional<EmployeesEntity> optional = employeesRepository.findById(id);
		EmployeesEntity employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException("Employeed not found for id::  " + id);
		}
		return employee;
	}
	
	@Override
	public void deleteEmployeeById(long id) {
		this.employeesRepository.deleteById(id);
	}
}
