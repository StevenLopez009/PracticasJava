package org.steven.hilos.ejemplos.ejercicio;

public class ContadorTarea implements Runnable {
    public enum Modo {
        ASCENDENTE,
        DESCENDENTE;
    }

    public ContadorTarea.Modo modo;

    public ContadorTarea(ContadorTarea.Modo modo) {
        this.modo = modo;
    }

    @Override
    public void run() {
        if(modo == Modo.ASCENDENTE){
            for (int i = 0; i <= 5; i++) {
                System.out.println("Numero ascendente: " + i);
            }
        }else if (modo == Modo.DESCENDENTE){
            for (int i = 5; i > 0; i--) {
                System.out.println("Numero descendente: " + i);
            }
        }
    }
}
