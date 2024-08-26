package com.ePrescription.E_Prescription.System.service;

import com.ePrescription.E_Prescription.System.model.Doctor;
import com.ePrescription.E_Prescription.System.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public void addDoctor(Doctor doctor){
        doctorRepository.save(doctor);
    }
}
