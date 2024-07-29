package com.example.Patient_app.controller;

import com.example.Patient_app.model.Patient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {
    public List<Patient>findAllPatients(){
        return null;
    }

}
