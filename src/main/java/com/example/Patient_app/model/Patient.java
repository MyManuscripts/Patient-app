package com.example.Patient_app.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;
import java.time.Period;

@Data
// @Builder
@Entity
public class Patient {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate dateBirth;
    @Column(unique = true)
    private String medCard;
    @Transient
    private int age;

    public int getAge() {
        return Period.between(dateBirth,LocalDate.now()).getYears();
    }
}

