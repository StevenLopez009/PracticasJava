package org.steven.app;

import org.steven.app.hogar.Persona;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Steven";
        System.out.println("Nombre: " + persona.nombre);
        Perro perro = new Perro();
    }
}
