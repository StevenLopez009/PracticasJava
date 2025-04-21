package org.steven.api.stream.ejemplos;
import org.steven.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("juan Guzman", "pepito Gonzalez", "cata Linares" , "juan lopez")
                .map(nombre ->new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(usuario -> usuario.getNombre().equals("juan"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println(usuario.get());

    }
}
