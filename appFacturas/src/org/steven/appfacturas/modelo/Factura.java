package org.steven.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int idFactura;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS= 10;
    private static int ultimoIdFactura;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.idFactura= ++ultimoIdFactura;
        this.fecha = new Date();
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        if(indiceItems<MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal() {
        float total = 0;
        for(ItemFactura item : items) {
            if(item == null) {
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle(){
        StringBuilder sb = new StringBuilder("Facturas N: ");
        sb.append(idFactura)
                .append("\nCliente ")
                .append(this.cliente.getNombre())
                .append("\nRUT O NIF ")
                .append(cliente.getNif())
                .append("\nDescripcion ")
                .append(this.descripcion)
                .append("\n");


        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        sb.append("Fecha de emision:\t").append(formato.format(fecha)).append("\n").append("\n#\tNombre\t$\tCant.\tTotal\n");;

        for(ItemFactura item : items) {
            if(item == null) {
                continue;
            }
            sb.append(item.toString())
                    .append("\n");
        }

        sb.append("\nTotal").append(calcularTotal());
        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }

}
