package org.steven.ejemplos.set.set;

import org.steven.ejemplos.set.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa= new ArrayList<>();
        sa.add(new Alumno("Atenea", 10));
        sa.add(new Alumno("Era", 25));
        sa.add(new Alumno("Zeus", 40));
        sa.add(new Alumno("Hades", 50));
        sa.add(new Alumno("Afrodita", 15));
        sa.add(new Alumno("Pedro", 15));
        sa.add(new Alumno("Pedro", 10));

        System.out.println("Utilizando la clase Collections");
        //Collections.sort(sa, (a,b)->a.getNombre().compareTo(b.getNombre()));
        sa.sort(Comparator.comparing(Alumno::getNombre));
        System.out.println(sa);

        System.out.println("Iterando usando foreach");
        for (Alumno a : sa) {
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }
    }
}
