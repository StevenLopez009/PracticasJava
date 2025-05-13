package org.steven.patrones.decorator;
import org.steven.patrones.decorator.decorador.MayusculasDecorador;
import org.steven.patrones.decorator.decorador.ReverseDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal ");
        MayusculasDecorador mayusculas = new MayusculasDecorador(texto);
        ReverseDecorador reverse = new ReverseDecorador(mayusculas);
        System.out.println(reverse.darFormato());
    }
}
