package com.nandini.app;

import com.nandini.app.controller.DoctorController;
import com.nandini.app.controller.PrescriptionController;
import com.nandini.app.model.Appointment;
import com.nandini.app.model.Prescription;
import com.nandini.app.repository.AppointmentRepository;
import com.nandini.app.repository.PrescriptionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class PrescriptionTest {
    @InjectMocks
    PrescriptionController prescriptionController;
    @Mock
    PrescriptionRepository prescriptionRepository;
    @Mock
    Prescription prescription;

    @BeforeEach
    void setUp() {
        prescriptionRepository = Mockito.mock(PrescriptionRepository.class);
        prescription = Mockito.mock(Prescription.class);
    }

    @Test
    public void TestGetAllPrescriptions() {
        List<Prescription> viewprescription = new ArrayList();
        Prescription prescription2 = new Prescription("p22", "a22", "infection", "pt22", "d22");
        viewprescription.add(prescription2);
        when(prescriptionRepository.findBypatientName(anyString())).thenReturn(viewprescription);
        List<Prescription> result = prescriptionController.getPrescription("p11");
        assertEquals(viewprescription.size(), 1);
        assertEquals(viewprescription.get(0).getPrescriptionId(), result.get(0).getPrescriptionId());
        assertEquals(viewprescription.get(0).getAppointmentId(), result.get(0).getAppointmentId());
        assertEquals(viewprescription.get(0).getDescription(), result.get(0).getDescription());
        assertEquals(viewprescription.get(0).getPatientName(), result.get(0).getPatientName());
        assertEquals(viewprescription.get(0).getDoctorName(), result.get(0).getDoctorName());
    }

    @Test
    public void TestSavePrescription() {
        Prescription saveprescription = new Prescription();
        saveprescription.setAppointmentId("a22");
        saveprescription.setPrescriptionId("p22");
        saveprescription.setDescription("infection");
        saveprescription.setDoctorName("d22");
        saveprescription.setPatientName("pt22");
        when(prescriptionRepository.save(any(Prescription.class))).thenReturn(saveprescription);
        Prescription result = prescriptionController.savePrescription(prescription);
        assertEquals(saveprescription.getPrescriptionId(), result.getPrescriptionId());
        assertEquals(saveprescription.getAppointmentId(), result.getAppointmentId());
        assertEquals(saveprescription.getDescription(), result.getDescription());
        assertEquals(saveprescription.getDoctorName(), result.getDoctorName());
        assertEquals(saveprescription.getPatientName(), result.getPatientName());
    }
}