package com.nandini.app.controller;

import com.nandini.app.model.Appointment;
import com.nandini.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    AppointmentRepository appointmentRepository;
    @GetMapping(value="/appointment")
    public List<Appointment> getAppointments(@RequestParam String patientName){
        return appointmentRepository.findByPatientName(patientName);
    }
    @PostMapping(value="/save")
    public Appointment savepatient(@RequestBody Appointment appointment){
        return appointment;
    }


}
