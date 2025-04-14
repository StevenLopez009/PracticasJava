package org.steven.ejemplos.set.set;

import org.steven.ejemplos.set.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> al = new LinkedList<>();
        System.out.println(al.size());
        al.add(new Alumno("Atenea", 10));
        al.add(new Alumno("Era", 25));
        al.add(new Alumno("Zeus", 40));
        al.add(new Alumno("Hades", 50));
        al.set(2,new Alumno("Afrodita", 15));
        al.add(1,new Alumno("Pedro", 15));

        System.out.println(al);
        System.out.println(al.size());

        al.addFirst(new Alumno("Juan", 15));

        System.out.println("Iterator");
        ListIterator<Alumno> li = al.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        


    }
}
