package com.ePrescription.E_Prescription.System.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "doctors")
public class Doctor {

    @Id
    private String id;

    private String name;

    private String email;

    private String specialty;

    private String password; // This should be stored as a hashed password

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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//
//    @Override
//    public String toString() {
//        return "Doctor{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", specialty='" + specialty + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }

//    public static void main(String[] args) {
//        Doctor doctor = new Doctor("Dr. John Doe", "john.doe@example.com", "Cardiology", "hashedPassword123");
//        System.out.println(doctor);
//    }
}