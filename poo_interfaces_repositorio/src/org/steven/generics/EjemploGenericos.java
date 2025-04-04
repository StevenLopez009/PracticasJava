package org.steven.generics;

import org.steven.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList <>();
        clientes.add(new Cliente("Andrea", "Lopez"));

        Cliente bea = clientes.get(0);

        Cliente [] clientesArreglo = {new Cliente("Luci", "Martinez"),
        new Cliente("Angelica", "Lopez")};

        Integer[] enterosArray = {1,2,3,4,5};

        List<Cliente> clientesList= fromArrayToList(clientesArreglo);
        List<Integer> enterosList = fromArrayToList(enterosArray);

        System.out.println("Maximo es: " + maximo(1,6,8));
    }

    public static <T extends Cliente> List<T> fromArrayToList(T[] array) {
        return Arrays.asList(array);
    }
    public static <T extends Number> List<T> fromArrayToList(T[] array) {
        return Arrays.asList(array);
    }

    public static <T extends Comparable<T>>  T maximo (T a, T b, T c) {
        T max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        return max;
    }
}
