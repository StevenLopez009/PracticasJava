package org.steven.hilos.ejemplos;

import org.steven.hilos.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) {
        Thread hilo = new NombreThread("Steven");
        hilo.start();
        System.out.println(hilo.getState());

    }
}
