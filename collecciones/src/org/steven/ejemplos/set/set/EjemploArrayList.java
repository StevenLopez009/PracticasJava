package org.steven.ejemplos.set.set;

import org.steven.ejemplos.set.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> al = new ArrayList<>();
        System.out.println(al.size());
        al.add(new Alumno("Atenea", 10));
        al.add(new Alumno("Era", 25));
        al.add(new Alumno("Zeus", 40));
        al.add(new Alumno("Hades", 50));
        al.set(2,new Alumno("Afrodita", 15));
        al.add(1,new Alumno("Pedro", 15));
        System.out.println(al);
        System.out.println(al.size());

        al.remove(new Alumno("Pedro", 15));
        System.out.println(al);
    }
}
