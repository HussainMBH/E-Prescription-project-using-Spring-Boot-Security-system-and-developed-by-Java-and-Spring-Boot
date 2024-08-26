package com.ePrescription.E_Prescription.System.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ePrescription.E_Prescription.System.model.Doctor;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {
}
