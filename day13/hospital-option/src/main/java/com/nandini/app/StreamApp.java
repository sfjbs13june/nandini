package com.nandini.app;

import com.nandini.app.model.Docter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApp {
    private static Docter[] arrayOfDoc = {
            new Docter(1, "Dr.Gill", 500000.0),
            new Docter(2, "Dr.Sumit", 700000.0),
            new Docter(3, "Dr.Sai", 900000.0)
    };

    public Stream<Docter> getDocterArray() {
        return Stream.of(arrayOfDoc);
    }

    public Stream<Docter> getDocterList() {
        List<Docter> docList = Arrays.asList(arrayOfDoc);
        return docList.stream();
    }

    public Stream<Docter> getDocterData() {
        return Stream.of(arrayOfDoc[0], arrayOfDoc[1], arrayOfDoc[2]);
    }

    public Stream<Docter> getDocterStreamBulider() {
        Stream.Builder<Docter> docStreamBuilder = Stream.builder();

        docStreamBuilder.accept(arrayOfDoc[0]);
        docStreamBuilder.accept(arrayOfDoc[1]);
        docStreamBuilder.accept(arrayOfDoc[2]);

        Stream<Docter> docStream = docStreamBuilder.build();
        return docStream;
    }
}
