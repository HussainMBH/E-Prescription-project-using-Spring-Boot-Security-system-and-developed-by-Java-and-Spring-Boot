package com.ePrescription.E_Prescription.System.service;

import com.ePrescription.E_Prescription.System.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ePrescription.E_Prescription.System.model.Patient;
import java.util.List;

import java.util.Optional;

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

    public Optional<Patient> getPatientByID(String id){
        return patientRepository.findById(id);
    }

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }
}
