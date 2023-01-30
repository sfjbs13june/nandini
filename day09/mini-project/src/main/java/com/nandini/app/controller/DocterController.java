package com.nandini.app.controller;

import com.nandini.app.model.Appointment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/docter")
public class DocterController {

    @GetMapping("/doctorappointment")
    public List<Appointment> getAppointments()
    {
        List Appointment = new ArrayList();
        Appointment appointment1 = new Appointment("Apt01","Pat01","Dr01","01-01-2023");
        Appointment appointment2 = new Appointment("Apt02","Pat02","Dr02","02-01-2023");
        Appointment appointment3 = new Appointment("Apt03","Pat03","Dr03","03-01-2023");


        Appointment.add(appointment1);
        Appointment.add(appointment2);
        Appointment.add(appointment3);
        return Appointment;
    }
    @PostMapping("/map/save")
    public Map mapAppointment(){
        Map docterMap= new HashMap();
        Appointment appointment1= new Appointment("Apt1","Pat01","Doc001","01/01/2023");
        Appointment appointment2= new Appointment("Apt2","Pat02","Doc002","02/01/2023");
        Appointment appointment3= new Appointment("Apt3","Pat03","Doc003","03/01/2023");
        docterMap.put(appointment1.getDoctorName(),appointment1);
        docterMap.put(appointment2.getDoctorName(),appointment2);
        docterMap.put(appointment3.getDoctorName(),appointment3);
        return  docterMap;
    }
}
