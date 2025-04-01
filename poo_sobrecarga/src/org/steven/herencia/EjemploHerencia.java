package org.steven.herencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("CREANDO LA INSTANCIA DE ALUMNO");
        Alumno alumno = new Alumno();
        alumno.setNombre("Steven");
        alumno.setApellido("Lopez");

        System.out.println("CREANDO LA INSTANCIA DE ALUMNOINTERNACIONAL");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("James");
        alumnoInternacional.setPais("Brasil");
        alumnoInternacional.setInstitucion("Instituto Nacional");

        System.out.println("CREANDO LA INSTANCIA DE PROFESO R");
        Profesor profesor = new Profesor();
        profesor.setNombre("Jorge");
        profesor.setApellido("Castro");
        profesor.setAsignatura("Programacion");

        System.out.println(alumno.getNombre());
        System.out.println(alumno.getApellido());

        System.out.println(profesor.getNombre());
        System.out.println(profesor.getApellido());
    }
}
