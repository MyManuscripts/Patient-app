package com.example.Patient_app.controller;

import com.example.Patient_app.model.Patient;
import com.example.Patient_app.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
@AllArgsConstructor

public class PatientController {

    private PatientService service;

    @GetMapping
    public List<Patient>findAllPatients(){
        return service.findAllPatients();
    }

    @PostMapping("save_patient")
    public String savePatient(@RequestBody Patient patient){
        service.savePatient(patient);
        return "patient saved";
    }

    @GetMapping("/{medCard}")
    public Patient findByMedCard(@PathVariable String medCard){
        return service.findByMedCard(medCard);
    }

    @PutMapping("update_patient")
    public Patient updatePatient(@RequestBody Patient patient){
        return service.updatePatient(patient);
    }

    @DeleteMapping("delete_patient/{medCard}")
    public void deletePatient(@PathVariable String medCard){
        service.deletePatient(medCard);
    }

}
