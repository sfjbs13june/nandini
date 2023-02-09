package com.nandini.app.controller;

import com.nandini.app.model.Prescription;
import com.nandini.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {
    @Autowired
    PrescriptionRepository prescriptionRepository;
    @RequestMapping(value = "/viewprescription",method = RequestMethod.GET)
    public List<Prescription> getPrescription(String patientName){
        return prescriptionRepository.findBypatientName(patientName);

    }
    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        prescription=prescriptionRepository.save(prescription);
        System.out.println(prescription);
        return prescription;
    }


}
