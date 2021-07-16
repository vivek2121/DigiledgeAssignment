package com.digiledge.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class PatientDetails {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long patientDetailsId;
	private String patientName;
	private String patientCovidStatus;
	private String patientAddress;
	public Long getPatientDetailsId() {
		return patientDetailsId;
	}
	public void setPatientDetailsId(Long patientDetailsId) {
		this.patientDetailsId = patientDetailsId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientCovidStatus() {
		return patientCovidStatus;
	}
	public void setPatientCovidStatus(String patientCovidStatus) {
		this.patientCovidStatus = patientCovidStatus;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public PatientDetails(Long patientDetailsId, String patientName, String patientCovidStatus, String patientAddress) {
		super();
		this.patientDetailsId = patientDetailsId;
		this.patientName = patientName;
		this.patientCovidStatus = patientCovidStatus;
		this.patientAddress = patientAddress;
	}
	public PatientDetails() {
	
	}
	
	
	
}
