package com.digiledge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.digiledge.entity.PatientDetails;
import com.digiledge.service.PatientService;



@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/patientregister")
	public String showForm(Model model) {
	    PatientDetails patientDetails = new PatientDetails();   
	    model.addAttribute("patientDetails", patientDetails);
	    return "patientregister";
	}
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("patientDetails") PatientDetails patientDetails) {
		patientService.savePatient(patientDetails);
	    return "registersuccess";
	}
	@RequestMapping("/patientlist")
    public String home(Model model) {
        model.addAttribute("patientList", patientService.getAllPatients());
        return "patient_list";
    }
	@RequestMapping("/patientupdate/{patientDetailsId}")
    public String updatePatient(Model model,@PathVariable Long patientDetailsId) {		
        model.addAttribute("patientDetails", patientService.getPatientById(patientDetailsId));
        return "patient_update";
    }
	@PostMapping("/update")
	public String updateForm(@ModelAttribute("patientDetails") PatientDetails patientDetails) {
		patientService.savePatient(patientDetails);;
	    return "update_success";
	}
	@RequestMapping("/patientdelete/{patientDetailsId}")
    public String deletePatient(@PathVariable Long patientDetailsId) {		
		patientService.deletePatient(patientDetailsId);
        return "patient_delete";
    }
	
}
