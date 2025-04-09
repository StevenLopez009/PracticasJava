package org.steven.ejemplos.set.set;

import java.util.HashSet;
import java.util.Set;

public class BuscarDuplicado {
    public static void main(String[] args) {
        String[] peces = {"Robalo", "Lenguado", "Atun", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        for (String p : peces) {
            if(!unicos.add(p)) {
                System.out.println("Elementos Duplicados: " + p);
            }
        }
        System.out.println("Elementos No Duplicados" + unicos);
    }
}
