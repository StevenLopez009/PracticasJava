package org.steven.pooclasesabstractas.form.elementos;

public class Opcion {
    private String value;
    private String nombre;
    private boolean selected;

    public Opcion() {
    }

    public Opcion(String value, String nombre) {
        this.value = value;
        this.nombre = nombre;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelected() {
        return selected;
    }

    public Opcion setSelected(boolean selected) {
        this.selected = selected;
        return this;
    }
}
