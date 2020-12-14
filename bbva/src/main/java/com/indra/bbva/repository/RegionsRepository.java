package com.indra.bbva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.bbva.model.RegionsEntity;

@Repository
public interface RegionsRepository extends JpaRepository<RegionsEntity, Long>{

}
