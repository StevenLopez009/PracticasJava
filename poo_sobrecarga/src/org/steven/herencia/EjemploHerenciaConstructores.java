package org.steven.herencia;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {
        System.out.println("CREANDO LA INSTANCIA DE ALUMNO");
        Alumno alumno = new Alumno("Steven", "Lopez", 26);
        alumno.setInstitucion("SENA");

        System.out.println("CREANDO LA INSTANCIA DE ALUMNO INTERNACIONAL");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("James", "Parker", "EEUU");
        alumnoInternacional.setEdad(22);
        alumnoInternacional.setInstitucion("Instituto Nacional");

        System.out.println("CREANDO LA INSTANCIA DE PROFESOR");
        Profesor profesor = new Profesor("Jorge", "Castro", "Programación");
        profesor.setEdad(42);

        System.out.println("\n--- DATOS DEL ALUMNO ---");
        imprimir(alumno);

        System.out.println("\n--- DATOS DEL ALUMNO INTERNACIONAL ---");
        imprimir(alumnoInternacional);

        System.out.println("\n--- DATOS DEL PROFESOR ---");
        imprimir(profesor);
    }

    public static void imprimir(Persona persona) {
        System.out.println(persona.getNombre()
                + " " + persona.getApellido()
                + " - Edad: " + persona.getEdad()
                + " - Email: " + persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
        }

        if (persona instanceof AlumnoInternacional) {
            System.out.println("Nacionalidad: " + ((AlumnoInternacional) persona).getPais());
        }

        if (persona instanceof Profesor) {
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
    }
}



