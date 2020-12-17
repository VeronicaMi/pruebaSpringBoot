package com.indra.bbva.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.indra.bbva.model.EmployeesEntity;

class EmployeesServiceImplTest {

	private EmployeesServiceImpl dao;
	
	/*@BeforeEach
	void setUp() throws Exception {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl("jdbc:oracle:thin:@localhost:1521/xepdb1");
		datasource.setUsername("hr");
		datasource.setPassword("miranda1");
		datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		
		dao = new EmployeesServiceImpl(new JdbcTemplate(datasource));
	}

	@Test
	void testGetAllEmployees() {
		List<EmployeesEntity> empleados = dao.getAllEmployees();
		
		assertTrue(empleados.isEmpty());
	}

	@Test
	void testSaveEmployee() {
		fail("Not yet implemented");
	}

	@Test
	void testGetEmployeeById() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteEmployeeById() {
		fail("Not yet implemented");
	}*/

}
