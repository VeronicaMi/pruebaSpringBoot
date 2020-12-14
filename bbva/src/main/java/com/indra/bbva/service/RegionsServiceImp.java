package com.indra.bbva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.indra.bbva.model.RegionsEntity;
import com.indra.bbva.repository.RegionsRepository;

@Service
public class RegionsServiceImp implements RegionsService{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private RegionsRepository regionsRepository;

	public RegionsServiceImp(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	@GetMapping("/")
	public List<RegionsEntity> getAllRegions() {
		String sql = "SELECT * FROM REGIONS";
		List<RegionsEntity> regiones = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(RegionsEntity.class));
		//List<EmployeesEntity> empleados = employeesRepository.findAll();
		return regiones;
	}
	
	@Override
	public void saveRegion(RegionsEntity region) {
		this.regionsRepository.save(region);
		System.out.println(region);
	}
	
	@Override
	public RegionsEntity getRegionById(long id) {
		Optional<RegionsEntity> optional = regionsRepository.findById(id);
		RegionsEntity region = null;
		if (optional.isPresent()) {
			region = optional.get();
		} else {
			throw new RuntimeException("Region not found for id::  " + id);
		}
		return region;
	}
	
	@Override
	public void deleteRegionById(long id) {
		this.regionsRepository.deleteById(id);
	}
	
	
}
