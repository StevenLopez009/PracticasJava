package org.steven.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{
    private String persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(String persona, String carrera,  String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<String>();
    }

    public Curriculum addExperiencias(String experiencia) {
        this.experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre:");
        sb.append(persona).append("\n")
                .append("Resumen: ")
                .append(this.contenido).append("\n")
                .append("Carrera: ").append(this.carrera).append("\n")
                .append("Experiencias: \n");

        for (String experiencia : this.experiencias) {
            sb.append(experiencia).append("\n");
        }
        return sb.toString();
    }
}
