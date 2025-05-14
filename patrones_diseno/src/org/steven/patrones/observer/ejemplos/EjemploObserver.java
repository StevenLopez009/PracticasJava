package org.steven.patrones.observer.ejemplos;

import org.steven.patrones.observer.Corpotation;
import org.steven.patrones.observer.Observable;

public class EjemploObserver {
    public static void main(String[] args) {
        Corpotation Google = new Corpotation("Google", 12000);
        Google.addObserver(observable ->{
            System.out.println("Observador1: " + ((Corpotation)observable).getCorpName() + "nuevo precio" + ((Corpotation)observable).getPrice());
        });

        Google.addObserver(observable ->{
            System.out.println("Observador2: " + ((Corpotation)observable).getCorpName() + "nuevo precio" + ((Corpotation)observable).getPrice());
        });

        Google.modifyPrice(2000);
    }
}
