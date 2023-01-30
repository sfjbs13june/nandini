package com.nandini.app.model;

public class Hospital {
    String id;
    String name;

    public Hospital(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
