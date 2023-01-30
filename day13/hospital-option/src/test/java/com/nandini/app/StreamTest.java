package com.nandini.app;

import com.nandini.app.model.Docter;
import com.nandini.app.model.DocterRepository;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamTest {
    private static Docter[] arrayOfDoc = {
            new Docter(1, "Dr.Gill", 500000.0),
            new Docter(2, "Dr.Sumit", 700000.0),
            new Docter(3, "Dr.Sai", 900000.0)
    };
    private static List<Docter> doctList = Arrays.asList(arrayOfDoc);
    private static DocterRepository docterRepository = new DocterRepository(doctList);
    @Test
    public void whenGetStreamFromList_ObtainStream() {
        assert(doctList.stream() instanceof Stream<?>);
    }

    @Test
    public void whenGetStreamFromArray_ObtainStream() {
        assert(Stream.of(arrayOfDoc) instanceof Stream<?>);
    }

    @Test
    public void whenGetStreamFromElements_ObtainStream() {
        assert(Stream.of(arrayOfDoc[0], arrayOfDoc[1], arrayOfDoc[2]) instanceof Stream<?>);
    }
    @Test
    public void whenBuildStreamFromElements_ObtainStream() {
        Stream.Builder<Docter> docStreamBuilder = Stream.builder();

        docStreamBuilder.accept(arrayOfDoc[0]);
        docStreamBuilder.accept(arrayOfDoc[1]);
        docStreamBuilder.accept(arrayOfDoc[2]);

        Stream<Docter> docterStream = docStreamBuilder.build();

        assert(docterStream instanceof Stream<?>);
    }
    @Test
    public void whenIncrementSalaryForEachDocter_thenApplyNewSalary() {
        Docter[] arrayOfDoc = {
                new Docter(1, "Dr.Gill", 500000.0),
                new Docter(2, "Dr.Sumit", 700000.0),
                new Docter(3, "Dr.Sai", 900000.0)
        };

        List<Docter> docList = Arrays.asList(arrayOfDoc);

        docList.stream().forEach(e -> e.salaryIncrement(10.0));
        docList.forEach(docter -> System.out.println(docter.toString()));

    }
    @Test
    public void whenIncrementSalaryUsingPeek_thenApplyNewSalary() {
        Docter[] arrayOfDoc = {
                new Docter(1, "Dr.Gill", 500000.0),
                new Docter(2, "Dr.Sumit", 700000.0),
                new Docter(3, "Dr.Sai", 900000.0)
        };

        List<Docter> docList = Arrays.asList(arrayOfDoc);

        docList.stream()
                .peek(e -> e.salaryIncrement(10.0))
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
    @Test
    public void whenMapIdToDocter_thenGetDocterStream() {
        Integer[] docIds = { 1, 2, 3 };

        List<Docter> docters = Stream.of(docIds)
                .map(docterRepository::findById)
                .collect(Collectors.toList());

        assertEquals(docters.size(), docIds.length);
    }

}

