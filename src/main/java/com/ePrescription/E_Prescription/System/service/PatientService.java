package com.ePrescription.E_Prescription.System.service;

import com.ePrescription.E_Prescription.System.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ePrescription.E_Prescription.System.model.Patient;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    public void addPatient(Patient patient){
        patientRepository.save(patient);
    }
}
