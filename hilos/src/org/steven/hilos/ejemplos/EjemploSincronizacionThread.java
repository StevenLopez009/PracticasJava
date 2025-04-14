package org.steven.hilos.ejemplos;

import org.steven.hilos.ejemplos.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) {
        new Thread(new ImprimirFrases("Hola1 ", "Hola2")).start();
        new Thread(new ImprimirFrases("Quien eres ? ", "tu")).start();
        new Thread(new ImprimirFrases("muchas ", "gracias")).start();
    }
    public synchronized static void imprimirFrases(String frase1, String frase2) {
        System.out.println(frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frase2);
    }
}
