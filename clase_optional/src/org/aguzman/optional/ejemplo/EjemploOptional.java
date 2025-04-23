package org.aguzman.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {
        String nombre= "Andres";
        Optional<String> opt = Optional.of(nombre);
    }
}
