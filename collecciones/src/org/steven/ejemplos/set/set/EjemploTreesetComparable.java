package org.steven.ejemplos.set.set;

import org.steven.ejemplos.set.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreesetComparable {
    public static void main(String[] args) {
        Set<Alumno> sa= new TreeSet<Alumno>();
        sa.add(new Alumno("Atenea", 10));
        sa.add(new Alumno("Era", 25));
        sa.add(new Alumno("Zeus", 40));
        sa.add(new Alumno("Hades", 50));
        sa.add(new Alumno("Afrodita", 15));
        sa.add(new Alumno("pedro", 15));
        sa.add(new Alumno("pedro", 10));

        System.out.println(sa);
    }
}
