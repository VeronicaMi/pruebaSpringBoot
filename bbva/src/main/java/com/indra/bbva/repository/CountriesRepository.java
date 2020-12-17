package com.indra.bbva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.bbva.model.CountriesEntity;

@Repository
public interface CountriesRepository extends JpaRepository<CountriesEntity, String> {

	/*@Query("SELECT * FROM Countries c JOIN Regions r ON c.region_id = r.region_id")
	public List<CountriesRegions> findContriesRegiosn;*/
	
	
}
