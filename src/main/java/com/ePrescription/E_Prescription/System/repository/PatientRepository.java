package com.ePrescription.E_Prescription.System.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ePrescription.E_Prescription.System.model.Patient;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {
}
