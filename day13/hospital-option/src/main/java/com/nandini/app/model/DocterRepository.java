package com.nandini.app.model;

import java.util.List;

public class DocterRepository {
    private List<Docter> docList;

    public DocterRepository(List<Docter> docList) {
        this.docList = docList;

    }
    public Docter findById(Integer id) {
        for (Docter doc : docList) {
            if (doc.getId() == id) {
                return doc;
            }
        }

        return null;
    }
}
