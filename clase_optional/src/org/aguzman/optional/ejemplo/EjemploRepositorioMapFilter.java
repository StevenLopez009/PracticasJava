package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.models.Fabricante;
import org.aguzman.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("rog")
                        .map(c->c.getProcesador())
                        .map(p->p.getFabricante())
                        .map(Fabricante::getNombre).orElse("Desconocido");

        System.out.println(f);
    }
}
