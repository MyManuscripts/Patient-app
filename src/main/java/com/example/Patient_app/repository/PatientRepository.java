package com.example.Patient_app.repository;

import com.example.Patient_app.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByMedCard(String medCard);
    void deleteByMedCard(String medCard);
}
