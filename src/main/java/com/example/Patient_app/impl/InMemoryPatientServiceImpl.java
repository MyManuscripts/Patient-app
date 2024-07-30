package com.example.Patient_app.impl;

import com.example.Patient_app.model.Patient;
import com.example.Patient_app.repository.InMemoryPatientDAO;
import com.example.Patient_app.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class InMemoryPatientServiceImpl implements PatientService {

    private final InMemoryPatientDAO repository;
    @Override
    public List<Patient> findAllPatients() {
        return repository.findAllPatients();
    }

    @Override
    public Patient savePatient(Patient patient) {
        return repository.savePatient(patient);
    }

    @Override
    public Patient findByMedCard(String medCard) {
        return repository.findByMedCard(medCard);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return repository.updatePatient(patient);
    }

    @Override

    public void deletePatient(String medCard) {
        repository.deletePatient(medCard);
    }
}
