package org.steven.hilos.ejemplos.ejercicio;

public class EjemploContadorTarea {
    public static void main(String[] args) {
        ContadorTarea ascendente = new ContadorTarea(ContadorTarea.Modo.ASCENDENTE);
        ContadorTarea descendente = new ContadorTarea(ContadorTarea.Modo.DESCENDENTE);

        Thread t1 = new Thread(ascendente);
        Thread t2 = new Thread(descendente);

        t1.start();
        t2.start();

    }
}
