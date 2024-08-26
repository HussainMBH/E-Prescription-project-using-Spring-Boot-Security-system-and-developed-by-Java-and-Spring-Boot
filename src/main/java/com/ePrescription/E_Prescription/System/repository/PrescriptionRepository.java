package com.ePrescription.E_Prescription.System.repository;

import com.ePrescription.E_Prescription.System.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends MongoRepository<Prescription, String> {
}
