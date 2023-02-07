package com.nandini.app.repository;

import com.nandini.app.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends MongoRepository<Prescription, String> {
    public Prescription findByPrescriptionId(String prescriptionId);
    public Prescription findByAppointmentId(String appointmentId);
    public Prescription findByDescription(String description);
    public Prescription findByPatientName(String patientName);
    public Prescription findByDoctorName(String doctorName);
    public Prescription save(Prescription prescription);


}
