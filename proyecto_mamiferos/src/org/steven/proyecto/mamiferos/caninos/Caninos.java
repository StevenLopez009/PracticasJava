package org.steven.proyecto.mamiferos.caninos;

import org.steven.proyecto.mamiferos.Mamiferos;

public class Caninos extends Mamiferos {
    private String color;
    private float tamanioColmillos;

    public Caninos(String habitat, float altura, float peso, float largo, String nombreCientifico) {
        super(habitat, altura, peso, largo, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanioColmillos() {
        return tamanioColmillos;
    }

    public void setTamanioColmillos(float tamanioColmillos) {
        this.tamanioColmillos = tamanioColmillos;
    }

    @Override
    public String comer() {
        return "";
    }

    @Override
    public String dormir() {
        return "";
    }

    @Override
    public String correr() {
        return "";
    }

    @Override
    public String comunicarse() {
        return "";
    }
}
