package com.digiledge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digiledge.entity.PatientDetails;

public interface PatientRepository extends JpaRepository<PatientDetails, Long>{

}
