package com.Hospital.Model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String patientname;
    private String age;
    private String gender;

    public Patient(String patientname, String age, String gender) {
        this.patientname = patientname;
        this.age = age;
        this.gender = gender;
    }



    @ManyToOne
    @JoinColumn(name = "disease_id")
    private Disease disease;

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }
}
