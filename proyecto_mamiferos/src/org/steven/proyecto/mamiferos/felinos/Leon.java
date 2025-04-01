package org.steven.proyecto.mamiferos.felinos;

public class Leon extends Felino {
    private int numeroManada;
    private float potenciaRugido;

    public Leon(String habitat, float altura, float peso, float largo, String nombreCientifico, float tamanioGarras, int velocidad,
                int numeroManada, float potenciaRugido) {
        super(habitat, altura, peso, largo, nombreCientifico, tamanioGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public void setNumeroManada(int numeroManada) {
        this.numeroManada = numeroManada;
    }

    public float getPotenciaRugido() {
        return potenciaRugido;
    }

    public void setPotenciaRugido(float potenciaRugido) {
        this.potenciaRugido = potenciaRugido;
    }

    @Override
    public String comer() {
        return "El leon caza junto a su grupo de " + numeroManada + "en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El leon duerme con su manada";
    }

    @Override
    public String correr() {
        return "El leon corre a una velocidad de :" + getVelocidad() + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El leon se comunica mediante rugidos";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(comer());
        System.out.println(dormir());
        System.out.println(correr());
        System.out.println(comunicarse());
    }
}
