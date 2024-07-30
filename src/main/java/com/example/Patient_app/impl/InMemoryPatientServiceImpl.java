package com.example.Patient_app.impl;

import com.example.Patient_app.model.Patient;
import com.example.Patient_app.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InMemoryPatientServiceImpl implements PatientService {
    @Override
    public List<Patient> findAllPatients() {
        return null;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return null;
    }

    @Override
    public Patient findByMedCard(String medCard) {
        return null;
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return null;
    }

    @Override

    public void deletePatient(String medCard) {

    }
}
