package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorio {
    public static void main(String[] args) {
        Repositorio<Computador>repositorio = new ComputadorRepositorio();

        repositorio.filtrar("asus").ifPresentOrElse(System.out::println,
                ()-> System.out.println("No se encuentra en inventario"));

        /*Optional<Computador> pc = repositorio.filtrar("asus rog");
        if(pc.isPresent()) {
            System.out.println(pc.get().toString());
        }else{
            System.out.println("No existe el computador");
        }*/

    }
}
