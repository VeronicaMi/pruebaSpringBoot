package com.indra.bbva.service;

import java.util.List;

import com.indra.bbva.model.EmployeesEntity;

public interface EmployeesService {
	public abstract List<EmployeesEntity> getAllEmployees();
	public abstract void saveEmployee(EmployeesEntity employees);
	public abstract EmployeesEntity getEmployeeById(long id);
	public abstract void deleteEmployeeById(long id);
}
