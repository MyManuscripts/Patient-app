package com.example.Patient_app.impl;

import com.example.Patient_app.model.Patient;
import com.example.Patient_app.repository.PatientRepository;
import com.example.Patient_app.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class PatientServiceImpl implements PatientService {

    private final PatientRepository repository;
    @Override
    public List<Patient> findAllPatients() {
        return repository.findAll();
    }

    @Override
    public Patient savePatient(Patient patient) {
        return repository.save(patient);
    }

    @Override
    public Patient findByMedCard(String medCard) {
        return repository.findByMedCard(medCard);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return repository.save(patient);
    }

    @Override
    @Transactional
    public void deletePatient(String medCard) {
        repository.deleteByMedCard(medCard);
    }
}
