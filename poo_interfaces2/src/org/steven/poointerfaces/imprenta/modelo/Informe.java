package org.steven.poointerfaces.imprenta.modelo;

public class Informe extends Hoja{
    private String autor;
    private String revisor;

    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "informe escrito por : " + autor
                + " revisado por : " + revisor
                + "\n" + contenido;

    }
}
