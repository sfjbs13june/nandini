package com.nandini.app.controller;

import com.nandini.app.model.Appointment;
import com.nandini.app.model.Prescription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RequestMapping("/patient")
public class PatientController {
    @GetMapping("/appointment")

    public List<Appointment> getMyAppointments(@RequestParam String patientName) {
        List Ap = new ArrayList();
        Appointment appointment1 = new Appointment("Apt01","Pat01","Dr01","01-01-2023");
        Appointment appointment2 = new Appointment("Apt02","Pat02","Dr02","02-01-2023");
        Appointment appointment3 = new Appointment("Apt03","Pat03","Dr03","03-01-2023");


        Appointment.add(appointment1);
        Appointment.add(appointment2);
        Appointment.add(appointment3);
        return Appointment;
    }
    @GetMapping("/map/patient")

    public Map mapPatient()
    {
        Map mapDoctor = new HashMap();
        Appointment Appointment1 = new Appointment("Apt01","Pat01","Dr01","01-01-2023");
        Appointment Appointment2 = new Appointment("Apt02","Pat02","Dr02","02-01-2023");

        mapDoctor.put(Appointment1.getPatientName(),Appointment1);
        mapDoctor.put(Appointment2.getPatientName(),Appointment2);
        return mapDoctor;
        Map mapPatient = new HashMap();
        Prescription Prescription1 = new Prescription("001","50","chough","Pat01","Dr01");
        mapPatient.put(Prescription1.getPatientName(),Prescription1);
        return mapPatient;
    }
}
