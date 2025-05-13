package org.steven.patrones.decorator.decorador;

import org.steven.patrones.decorator.Formateable;

public class ReverseDecorador extends TextoDecorador{
    public ReverseDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
}
