package org.steven.hilos.ejemplos;

import org.steven.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {
        new Thread(new ViajeTarea("Alemania")).start();
        new Thread(new ViajeTarea("Colombia")).start();
        new Thread(new ViajeTarea("España")).start();
        new Thread(new ViajeTarea("Francia")).start();

    }
}
