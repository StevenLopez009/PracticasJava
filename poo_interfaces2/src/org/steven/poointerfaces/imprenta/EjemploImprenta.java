package org.steven.poointerfaces.imprenta;

import org.steven.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("steven", "desarrollo de software", "resumen laboral");
        cv.addExperiencias("java");
        cv.addExperiencias("react");

        Libro libro = new Libro("George orwell","1984", Genero.ACCION );
        libro.addPagina(new Pagina("capitulo 1"))
                .addPagina(new Pagina("capitulo 2"))
                .addPagina(new Pagina("capitulo 3"));

        Informe informe = new Informe("estudio sobre desarrollo", "steven", "juan");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
