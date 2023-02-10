package com.nandini.app;

import com.nandini.app.controller.DoctorController;
import com.nandini.app.controller.PatientController;
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
public class PatientTest {
    @InjectMocks
    PatientController patientController;
    @Mock
    AppointmentRepository appointmentRepository;
    @Mock
    Appointment appointment;

    @BeforeEach
    void setUp() {
        appointmentRepository = Mockito.mock(AppointmentRepository.class);
        appointment = Mockito.mock(Appointment.class);
    }
    @Test
    public void TestGetAppointments() {
        List<Appointment> getMyAppointment = new ArrayList();
        Prescription prescription1 = new Prescription("p11","a11","cough","pat11","dr11");
        Appointment appointmentpatient = new Appointment("a11","pat11","dr11","1 jan",prescription1);
        getMyAppointment.add(appointmentpatient);
        when(appointmentRepository.findByPatientName(anyString())).thenReturn(getMyAppointment);
        List<Appointment> result = patientController.getAppointments("pat01");
        assertEquals(getMyAppointment.size(), 1);
        assertEquals(getMyAppointment.size(), 1);
        assertEquals(getMyAppointment.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(getMyAppointment.get(0).getDate(),result.get(0).getDate());
        assertEquals(getMyAppointment.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(getMyAppointment.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(getMyAppointment.get(0).getPrescription().getDescription(),result.get(0).getPrescription().getDescription());
    }
    @Test
    public void TestSaveAppointment() {
        Appointment savePatientAppointment=new Appointment();
        savePatientAppointment.setAppointmentId("a03");
        savePatientAppointment.setDate("10-2-2023");
        savePatientAppointment.setDoctorName("doc04");
        savePatientAppointment.setPatientName("pat04");
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(savePatientAppointment);
        Appointment result = patientController.savepatient(appointment);
        assertEquals(savePatientAppointment.getAppointmentId(), result.getAppointmentId());
        assertEquals(savePatientAppointment.getDate(), result.getDate());
        assertEquals(savePatientAppointment.getDoctorName(),result.getDoctorName());
        assertEquals(savePatientAppointment.getPatientName(), result.getPatientName());

    }
}
