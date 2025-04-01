package org.steven.proyecto.mamiferos;
import org.steven.proyecto.mamiferos.felinos.Leon;
import org.steven.proyecto.mamiferos.felinos.Tigre;

import java.util.ArrayList;
import java.util.List;

public class EjemploMamiferos {
    public static void main(String[] args) {
        List<Mamiferos> mamiferos = new ArrayList<>();

        Mamiferos tigre = new Tigre(
                "Bosque",
                1.10f,
                250 ,
                2.5f,
                "panthera tigris",
                4.0f,
                50,
                "panthera");

        Mamiferos leon = new Leon(
                "Sabana Africana",
                1.2f,
                190.5f,
                2.5f,
                "Panthera leo",
                6.0f,
                80,
                10,
                114.0f
        );

        mamiferos.add(tigre);
        mamiferos.add(leon);

        for (Mamiferos animal : mamiferos) {
            System.out.println("----------------------");
            animal.mostrarInformacion();
        }
    }
}
