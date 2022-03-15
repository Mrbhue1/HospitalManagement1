package com.Hospital.Repository;

import com.Hospital.Model.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctors,Integer> {
}
