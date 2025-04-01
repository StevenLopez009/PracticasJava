package org.steven.proyecto.mamiferos.felinos;
import org.steven.proyecto.mamiferos.Mamiferos;

public class Felino extends Mamiferos {
    private float tamanioGarras;
    private int velocidad;

    public Felino(String habitat, float altura, float peso, float largo, String nombreCientifico,
                  float tamanioGarras, int velocidad) {
        super(habitat, altura, peso, largo, nombreCientifico);
        this.tamanioGarras = tamanioGarras;
        this.velocidad = velocidad;
    }

    public float getTamanioGarras() {
        return tamanioGarras;
    }

    public void setTamanioGarras(float tamanioGarras) {
        this.tamanioGarras = tamanioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String comer() {
        return "los felinos comen carne";
    }

    @Override
    public String dormir() {
        return "los felinos duermen en arboles o en la sabana";
    }

    @Override
    public String correr() {
        return "los felinos son buenos corredores ";
    }

    @Override
    public String comunicarse() {
        return "los felinos usan sonidos para comunicarse";
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tamaño de garras: " + this.tamanioGarras + " cm");
        System.out.println("Velocidad: " + this.velocidad + " km/h");
    }
}
