package com.indra.bbva.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.bbva.model.EmployeesEntity;

@Repository
public interface EmployeesRepository extends JpaRepository<EmployeesEntity, Long>{
}
