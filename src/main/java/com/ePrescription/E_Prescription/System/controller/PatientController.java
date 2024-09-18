package com.ePrescription.E_Prescription.System.controller;

import com.ePrescription.E_Prescription.System.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ePrescription.E_Prescription.System.model.Patient;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/addpatient")
    public ResponseEntity<String> addPatient(@Valid @RequestBody Patient patient){
        patientService.addPatient(patient);
        return new ResponseEntity<>("Patient detail added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/getpatient/{id}")
    public Optional<Patient> getPatient(@PathVariable String id){
        return patientService.getPatientByID(id);
    }

    @GetMapping("/getallpatients")
    public ResponseEntity<List<Patient>> getAllPatients(){
        List<Patient> patients = patientService.getAllPatients();
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }
}
