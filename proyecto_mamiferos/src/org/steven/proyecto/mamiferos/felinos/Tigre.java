package org.steven.proyecto.mamiferos.felinos;

public class Tigre extends Felino {
    protected String especie;

    public Tigre(String habitat, float altura, float peso, float largo, String nombreCientifico, float tamanioGarras, int velocidad, String especie) {
        super(habitat, altura, peso, largo, nombreCientifico, tamanioGarras, velocidad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String comer() {
        return "El tigre caza de forma solitaria en " + getHabitat();
    }

    @Override
    public String dormir() {
        return "El tigre duerme en áreas ocultas de " + getHabitat();
    }

    @Override
    public String correr() {
        return "El tigre corre a una velocidad de: " + getVelocidad() + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El tigre se comunica mediante rugidos y olores";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Subespecie: " + this.especie);
        System.out.println(comer());
        System.out.println(dormir());
        System.out.println(correr());
        System.out.println(comunicarse());

    }
}
