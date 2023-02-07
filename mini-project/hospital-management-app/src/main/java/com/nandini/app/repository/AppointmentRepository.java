package com.nandini.app.repository;

import com.nandini.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, String> {

    public Appointment findByAppointmentId(String appointmentId);
    public Appointment findByPatientName(String patientName);
    public Appointment findByDoctorName(String doctorName);
    public Appointment findByDate(String date);
    public Appointment findByPrescription(String prescription);
    public Appointment save(Appointment appointment);

}
