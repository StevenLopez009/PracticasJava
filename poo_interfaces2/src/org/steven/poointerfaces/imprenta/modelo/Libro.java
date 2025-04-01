package org.steven.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{
    private List<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<Imprimible>();
    }

    public Libro addPagina(Imprimible hoja) {
        this.paginas.add(hoja);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder sb =  new StringBuilder();
        sb.append(titulo)
                .append("\n")
                .append(autor)
                .append("\n")
                .append(genero)
                .append("\n");
        for (Imprimible pag : paginas) {
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
