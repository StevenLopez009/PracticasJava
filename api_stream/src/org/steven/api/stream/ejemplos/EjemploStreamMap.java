package org.steven.api.stream.ejemplos;
import org.steven.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("juan Guzman", "pepito Gonzalez", "cata Linares" )
                .map(nombre ->new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    String apellido = usuario.getApellido().toUpperCase();
                    usuario.setApellido(apellido);
                    return usuario;
                });
        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(u-> System.out.println(u));

    }
}
