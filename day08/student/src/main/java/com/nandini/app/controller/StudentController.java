package com.nandini.app.controller;

import com.nandini.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    @GetMapping("/get/student")
    public List<Student> getStudent(){
        List listStudent= new ArrayList();
        Student student1= new Student("Stu1","001","std1","Ramdaspeth School");
        Student student2= new Student("Stu2","002","std2","Nikalas School");
        Student student3= new Student("Stu3","003","std3","Khamla School");

        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        return  listStudent;

    }
    @GetMapping("/map/student")
    public Map mapStudent(){
        Map studentMap= new HashMap();
        Student student1= new Student("Stu1","001","std1","Ramdaspeth School");
        Student student2= new Student("Stu2","002","std2","Nikalas School");
        Student student3= new Student("Stu3","003","std3","Khamla School");

        studentMap.put(student1.getName(),student1);
        studentMap.put(student2.getRollno(),student2);
        studentMap.put(student3.getStd(),student3);
        return  studentMap;
    }

}
