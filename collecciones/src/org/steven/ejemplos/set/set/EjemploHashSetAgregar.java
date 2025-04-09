package org.steven.ejemplos.set.set;

import java.util.HashSet;
import java.util.Set;


public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        Set<String> hset = new HashSet<String>();
        hset.add("uno");
        hset.add("dos");
        hset.add("tres");
        hset.add("cuatro");
        hset.add("cinco");
        System.out.println(hset);
    }
}
