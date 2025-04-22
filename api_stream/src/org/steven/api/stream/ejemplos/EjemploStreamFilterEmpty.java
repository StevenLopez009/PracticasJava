package org.steven.api.stream.ejemplos;
import org.steven.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {
        long count = Stream
                .of("juan Guzman", "pepito Gonzalez", "cata Linares", "" , "juan lopez", "")
                .filter(n->n.isEmpty())
                .peek(System.out::println).count();

        System.out.println(count);

    }
}
