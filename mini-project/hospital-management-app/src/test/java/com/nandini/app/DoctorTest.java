package com.nandini.app;

import com.nandini.app.controller.DoctorController;
import com.nandini.app.model.Appointment;
import com.nandini.app.model.Prescription;
import com.nandini.app.repository.AppointmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DoctorTest {
    @InjectMocks
    DoctorController doctorController;
    @Mock
    AppointmentRepository appointmentRepository;
    @Mock
    Appointment appointment;
    @BeforeEach
    void setUp(){
        appointmentRepository= Mockito.mock(AppointmentRepository.class);
        appointment=Mockito.mock(Appointment.class);
    }
    @Test
    public void TestGetAppointment(){
        List<Appointment>appointments=new ArrayList<>();
        Appointment appointment1=new Appointment();
        appointment1.setAppointmentId("111");
        appointment1.setDoctorName("d11");
        appointment1.setDate("1 jan");
        appointment1.setPatientName("p11");
        appointments.add(appointment1);
        Prescription prescription=new Prescription("22","33","fever","gg","Dr11");
        when(appointmentRepository.findByDoctorName(anyString())).thenReturn(appointments);
        List<Appointment> result=doctorController.getAppointments("d11");
        assertEquals(appointments.size(),1);
        assertEquals(appointments.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(appointments.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(appointments.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(appointments.get(0).getDate(),result.get(0).getDate());
        assertEquals(appointments.get(0).getPrescription().getPrescriptionId(),result.get(0).getPrescription().getPrescriptionId());
        assertEquals(appointments.get(0).getPrescription().getDoctorName(),result.get(0).getPrescription().getDoctorName());
        assertEquals(appointments.get(0).getPrescription().getPatientName(),result.get(0).getPrescription().getPatientName());
        assertEquals(appointments.get(0).getPrescription().getDescription(),result.get(0).getPrescription().getDescription());

    }
    @Test
    public void TestSaveAppointment() {
        Appointment saveAppointment=new Appointment();
        saveAppointment.setAppointmentId("222");
        saveAppointment.setDate("2 jan");
        saveAppointment.setDoctorName("d22");
        saveAppointment.setPatientName("p22");
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(saveAppointment);
        Appointment result = doctorController.saveAppointment(appointment);
        assertEquals(saveAppointment.getAppointmentId(), result.getAppointmentId());
        assertEquals(saveAppointment.getDate(), result.getDate());
        assertEquals(saveAppointment.getDoctorName(),result.getDoctorName());
        assertEquals(saveAppointment.getPatientName(), result.getPatientName());
    }





















}