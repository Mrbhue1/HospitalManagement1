package com.Hospital;

import com.Hospital.Model.Disease;
import com.Hospital.Model.Doctors;
import com.Hospital.Model.Patient;
import com.Hospital.Repository.DiseaseRepo;
import com.Hospital.Repository.DoctorRepo;
import com.Hospital.Repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.print.Doc;

@SpringBootApplication
public class PatientManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PatientManagementApplication.class, args);
	}

	@Autowired
	private DoctorRepo doctorRepo;
	@Autowired
	private PatientRepo patientRepo;
	@Autowired
	private DiseaseRepo diseaseRepo;
	@Override
	public void run(String... args) throws Exception {


		Doctors doctors=new Doctors("Dr. Raju");
		Patient patient=new Patient("Rahul","22","male");
		Disease disease=new Disease("jaundice");
		doctors.setDisease(disease);
		doctors.setPatient(patient);
		doctorRepo.save(doctors);
		patient.setDisease(disease);
		patientRepo.save(patient);

		Doctors doctors1=new Doctors("Dr.Ramya");
		Patient patient1=new Patient("Siv","21","male");
		Disease disease1=new Disease("Diabetes");
		doctors1.setDisease(disease1);
		doctors1.setPatient(patient1);
		doctorRepo.save(doctors1);
		patient1.setDisease(disease1);
		patientRepo.save(patient1);

		Doctors doctors2=new Doctors("Dr.Raghu");
		Patient patient2=new Patient("Shanti","24","female");
		Disease disease2=new Disease("Diabetes");
		doctors2.setDisease(disease2);
		doctors2.setPatient(patient2);
		doctorRepo.save(doctors2);
		patient2.setDisease(disease2);
		patientRepo.save(patient2);
	}
}
