package org.steven.patrones.decorator.decorador;

import org.steven.patrones.decorator.Formateable;

public class MayusculasDecorador extends TextoDecorador{

    public MayusculasDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
