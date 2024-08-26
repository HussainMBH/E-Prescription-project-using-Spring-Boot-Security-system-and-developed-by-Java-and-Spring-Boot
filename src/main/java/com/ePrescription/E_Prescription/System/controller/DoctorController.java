package com.ePrescription.E_Prescription.System.controller;

import com.ePrescription.E_Prescription.System.model.Doctor;
import com.ePrescription.E_Prescription.System.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/adddoctor")
    public ResponseEntity<String> addDoctor(@Valid @RequestBody Doctor doctor){
        doctorService.addDoctor(doctor);
        return new ResponseEntity<>("Doctor details added successfully", HttpStatus.CREATED);
    }
}
