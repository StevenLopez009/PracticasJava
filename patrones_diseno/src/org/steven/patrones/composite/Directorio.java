package org.steven.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente {
    private List<Componente> hijos;

    public Directorio(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<>();
    }

    public Directorio addComponente(Componente c){
        hijos.add(c);
        return this;
    }

    public void removeComponente(Componente c){
        hijos.remove(c);

    }

    @Override
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("/");
        for (Componente c : hijos) {
            sb.append(c.mostrar()).append("/");
        }
        return sb.toString();
    }
}
