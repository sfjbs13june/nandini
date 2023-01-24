package com.nandini.app.service;

import com.nandini.app.model.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientService {
    public Patient updateDetail(Patient patient, String disease,String age) {
        patient.setDisease(disease);
        patient.setAge(age);
        return patient;
    }

}
