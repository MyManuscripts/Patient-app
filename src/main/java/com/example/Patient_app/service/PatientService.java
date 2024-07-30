package com.example.Patient_app.service;

import com.example.Patient_app.model.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> findAllPatients();

    Patient savePatient(Patient patient);

    Patient findByMedCard(String medCard);

    Patient updatePatient(Patient patient);

    void deletePatient(String medCard);

}
