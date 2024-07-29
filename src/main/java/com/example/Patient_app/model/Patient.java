package com.example.Patient_app.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;

@Data
@Builder
public class Patient {
    private String firstName;
    private String lastName;
    private LocalDate dateBirth;
    @NonNull
    private String medCard;
    private int age;
}
