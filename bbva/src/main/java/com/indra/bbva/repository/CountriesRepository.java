package com.indra.bbva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.bbva.model.CountriesEntity;

@Repository
public interface CountriesRepository extends JpaRepository<CountriesEntity, String> {

}
