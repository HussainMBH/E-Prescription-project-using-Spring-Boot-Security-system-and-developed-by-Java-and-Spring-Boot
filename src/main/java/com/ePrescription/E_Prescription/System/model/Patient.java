package com.ePrescription.E_Prescription.System.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "patients")
public class Patient {

    @Id
    private String id;

    private String name;

    private String email;

    private String medicalHistory;

    private List<String> allergies;

    // Constructors
    public Patient() {}

    public Patient(String name, String email, String medicalHistory, List<String> allergies) {
        this.name = name;
        this.email = email;
        this.medicalHistory = medicalHistory;
        this.allergies = allergies;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", medicalHistory='" + medicalHistory + '\'' +
                ", allergies=" + allergies +
                '}';
    }
}
