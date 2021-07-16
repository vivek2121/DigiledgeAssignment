package com.digiledge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digiledge.entity.PatientDetails;
import com.digiledge.exception.DataNotFoundException;
import com.digiledge.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepo;
	
	public void savePatient(PatientDetails patientDetails) {
		patientRepo.save(patientDetails);		
	}
	public List<PatientDetails>getAllPatients(){
		return patientRepo.findAll();
	}
	public PatientDetails getPatientById(Long patientDetailsId) {
		return patientRepo.findById(patientDetailsId).get();
	}
	public PatientDetails updatePatientById(PatientDetails patientDetails,Long patientDetailsId) {
		Optional<PatientDetails> patientDetailsRepo = patientRepo.findById(patientDetailsId);
		if(patientDetailsRepo.isPresent()) {
			patientDetailsRepo.get().setPatientName(patientDetails.getPatientName());
			patientDetailsRepo.get().setPatientCovidStatus(patientDetails.getPatientCovidStatus());
			patientDetailsRepo.get().setPatientAddress(patientDetails.getPatientAddress());
			return patientRepo.save(patientDetailsRepo.get());
		}else {
			throw new DataNotFoundException("Given Id is not Present");
		}
	}
	public String deletePatient(Long patientDetailsId) {
		patientRepo.deleteById(patientDetailsId);
		return "patinet deleted";
	}

}
