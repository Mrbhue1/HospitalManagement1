package com.Hospital.Repository;

import com.Hospital.Model.Disease;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DiseaseRepo extends JpaRepository<Disease,Integer> {
}
