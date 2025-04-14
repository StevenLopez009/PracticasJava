package org.steven.hilos.ejemplos.ejemplosync.runnable;
import org.steven.hilos.ejemplos.ejemplosync.Panaderia;

public class EjemploProductoConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Cliente(p)).start();
    }
}
