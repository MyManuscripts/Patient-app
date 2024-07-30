package com.example.Patient_app.repository;

import com.example.Patient_app.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryPatientDAO {
    private final List<Patient>bufferListPatients = new ArrayList<>();


    public List<Patient> findAllPatients() {
        return bufferListPatients;
    }


    public Patient savePatient(Patient patient) {
        bufferListPatients.add(patient);
        return patient;
    }


    public Patient findByMedCard(String medCard) {
        return bufferListPatients.stream()
                .filter(e->e.getMedCard().equals(medCard))
                .findFirst()
                .orElse(null);
    }


    public Patient updatePatient(Patient patient) {
        var patientIndex = IntStream.range(0,bufferListPatients.size())
                .filter(index->bufferListPatients.get(index).getMedCard().equals(patient.getMedCard()))
                .findFirst()
                .orElse(-1);
        if (patientIndex > -1){
            bufferListPatients.add(patientIndex,patient);
            return patient;
        }
        return null;
    }



    public void deletePatient(String medCard) {
        var patient = findByMedCard(medCard);
        if(patient != null){
            bufferListPatients.remove(patient);
        }
    }
}
