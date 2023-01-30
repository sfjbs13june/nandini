package com.nandini.app.model;

public class Docter {


    int id;
    String name;
    double salary;
    public Docter(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void salaryIncrement(double data){
        this.salary=salary;
    }
    public void salaryIncrement(Double percentage) {
        Double newSalary = salary + percentage * salary / 100;
        setSalary(newSalary);
    }

    public String toString() {
        return "Id: " + id + " Name:" + name + " Price:" + salary;
    }




}
