package org.steven.hilos.ejemplos.ejercicio;

public class EjemploAlfaNumerico {
    public static void main(String[] args) {
        AlfaNumerico numeros = new AlfaNumerico(AlfaNumerico.Tipo.NUMERO);
        AlfaNumerico letras = new AlfaNumerico(AlfaNumerico.Tipo.LETRA);

        Thread hiloNumeros = new Thread(numeros);
        Thread hiloLetras = new Thread(letras);

        hiloNumeros.start();
        hiloLetras.start();
    }
}
