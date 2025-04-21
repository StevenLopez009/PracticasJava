package org.steven.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("juan", "pepito", "cata" );
        nombres.forEach(System.out::println);

        String[] arr = {"juan", "pepito", "cata"};
        Stream<String> nombres2 = Arrays.stream(arr);
        nombres2.forEach(System.out::println);

        Stream<String> nombres3= Stream.<String>builder().add("Pato").add("Paco").build();
        nombres3.forEach(System.out::println);

        List<String>lista = new ArrayList<>();
        lista.add("Juan");
        lista.add("Pepito");
        lista.add("Cata");

        //Stream<String>nombres4 = lista.stream();
        //nombres4.forEach(System.out::println);

        lista.stream().forEach(System.out::println);
    }
}
