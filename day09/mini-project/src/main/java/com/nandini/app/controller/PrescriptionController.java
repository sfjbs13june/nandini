package com.nandini.app.controller;

import com.nandini.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/Prescription")
public class PrescriptionController {
    @GetMapping("/viewprescription")
    public List<Prescription> getAllPrescriptions(String patientName){

        return null;
        public List<Prescription> getAllPrescriptions(@RequestParam String patientName){
            List Appointment = new ArrayList();
            Prescription Pre1 = new Prescription("001","50","chough","Pat01","Dr01");
            Appointment.add(Pre1);
            return Appointment;
        }
        @PostMapping("/saveprescription")
        public Prescription savePrescription(@RequestBody Prescription prescription){

            System.out.println(prescription);
            return prescription;
        }
        @GetMapping("/Map/prescription")
        public Map MapPrescription()
        {
            Map MapPrescription = new HashMap();
            Prescription Pre1 = new Prescription("001","50","chough","Pat01","Dr01");
            MapPrescription.put(Pre1.getPrescriptionId(),Pre1);
            return MapPrescription;
        }
}
