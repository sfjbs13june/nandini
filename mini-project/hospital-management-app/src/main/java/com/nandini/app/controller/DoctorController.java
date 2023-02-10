package com.nandini.app.controller;

import com.nandini.app.model.Appointment;
import com.nandini.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    AppointmentRepository appointmentRepository;
    @GetMapping(value="/appointment")
    public List<Appointment> getAppointments(@RequestParam String doctorName){
        return appointmentRepository.findByDoctorName(doctorName);
    }
    @PostMapping(value="/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment ){
        appointment=appointmentRepository.save(appointment);
        return appointment;
    }

}
