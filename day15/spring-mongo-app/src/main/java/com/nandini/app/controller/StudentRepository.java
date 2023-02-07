package com.nandini.app.controller;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository {
    public Student findByName(String name);

    public Student save(Student student);

}
