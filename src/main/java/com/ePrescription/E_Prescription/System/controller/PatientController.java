package com.ePrescription.E_Prescription.System.controller;

import com.ePrescription.E_Prescription.System.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ePrescription.E_Prescription.System.model.Patient;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/addPatient")
    public ResponseEntity<String> addPatient(@Valid @RequestBody Patient patient){
        patientService.addPatient(patient);
        return new ResponseEntity<>("Patient detail added successfully", HttpStatus.CREATED);
    }
}
