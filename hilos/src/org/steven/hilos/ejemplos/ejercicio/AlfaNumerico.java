package org.steven.hilos.ejemplos.ejercicio;

public class AlfaNumerico implements Runnable{
     public enum Tipo {
         NUMERO,
         LETRA
     }

     public Tipo tipo;

    public AlfaNumerico(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        if (tipo == Tipo.NUMERO) {
            for (int i = 1; i < 10; i++) {
                System.out.println("Número: " + i);
            }
        } else if (tipo == Tipo.LETRA) {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println("Letra: " + c);
            }
        }
    }
}
