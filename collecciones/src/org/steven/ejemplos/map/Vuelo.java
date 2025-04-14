package org.steven.ejemplos.map;


import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private LocalDate fechaLlegada;
    private LocalTime horaLlegada;
    private int numeroPasajeros;

    public Vuelo(String nombre, String origen, String destino, LocalDate fechaLlegada, LocalTime horaLlegada, int numeroPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDate fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String toString() {
        return
                "nombre del vuelo: " + nombre + '\'' +
                ", origen=" + origen + '\'' +
                ", fecha Llegada=" + fechaLlegada +
                ", hora Llegada=" + horaLlegada +
                ", numero de Pasajeros=" + numeroPasajeros ;
    }
}
