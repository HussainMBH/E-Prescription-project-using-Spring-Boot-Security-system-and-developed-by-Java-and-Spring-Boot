package com.ePrescription.E_Prescription.System.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "prescriptions")
public class Prescription {

    @Id
    private String id;

    private String doctorId;

    private String patientId;

    private String medicationDetails;

    private Date date;

    private String status;

    // Constructors
    public Prescription() {}

    public Prescription(String doctorId, String patientId, String medicationDetails, Date date, String status) {
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.medicationDetails = medicationDetails;
        this.date = date;
        this.status = status;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getMedicationDetails() {
        return medicationDetails;
    }

    public void setMedicationDetails(String medicationDetails) {
        this.medicationDetails = medicationDetails;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id='" + id + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", medicationDetails='" + medicationDetails + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
