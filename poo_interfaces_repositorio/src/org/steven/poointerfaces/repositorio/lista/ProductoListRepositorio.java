package org.steven.poointerfaces.repositorio.lista;

import org.steven.poointerfaces.modelo.Cliente;
import org.steven.poointerfaces.modelo.Producto;
import org.steven.poointerfaces.repositorio.AbstractListRepositorio;
import org.steven.poointerfaces.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractListRepositorio<Producto> {
    @Override
    public void actualizarCliente(Producto producto) {
        Producto p = obtenerPorId(producto.getId());
        p.setDescripcion(producto.getDescripcion());
        p.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listarClientes(String campo, Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
            int resultado = switch (campo) {
                case "id" -> a.getId().compareTo(b.getId());
                case "descripcion" -> a.getDescripcion().compareTo(b.getDescripcion());
                case "precio" -> a.getPrecio().compareTo(b.getPrecio());
                default -> 0;
            };
            return dir == Direccion.DESC ? -resultado : resultado;
        });
        return listaOrdenada;
    }
}
