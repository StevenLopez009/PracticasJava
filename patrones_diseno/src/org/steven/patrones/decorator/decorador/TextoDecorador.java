package org.steven.patrones.decorator.decorador;

import org.steven.patrones.decorator.Formateable;

abstract class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }

}
