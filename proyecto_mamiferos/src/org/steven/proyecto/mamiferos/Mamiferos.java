package org.steven.proyecto.mamiferos;

abstract public class Mamiferos {
    protected String habitat;
    protected float altura;
    protected float peso;
    protected float largo;
    protected String nombreCientifico;

    public Mamiferos(String habitat, float altura, float peso, float largo, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
        this.largo = largo;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void mostrarInformacion() {
        System.out.println("=== Información del Mamífero ===");
        System.out.println("Nombre Científico: " + this.nombreCientifico);
        System.out.println("Habitat: " + this.habitat);
        System.out.println("Altura: " + this.altura + " m");
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Largo: " + this.largo + " m");
    }

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();

}
