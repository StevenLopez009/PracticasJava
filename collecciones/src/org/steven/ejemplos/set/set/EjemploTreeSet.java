package org.steven.ejemplos.set.set;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        Set<String> tset = new TreeSet<String>();
        tset.add("uno");
        tset.add("dos");
        tset.add("tres");
        tset.add("cuatro");
        tset.add("cinco");

        System.out.println(tset);

    }
}
