package com.Hospital.Model;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    //private String specialization;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")

    private Patient patient;

    public Doctors() {
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctors(String name) {
        this.name = name;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "disease_id")
    private Disease disease;

    public Disease getDisease() {
        return disease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }
}
