package org.steven.poointerfaces.repositorio.lista;

import org.steven.poointerfaces.modelo.Cliente;
import org.steven.poointerfaces.repositorio.AbstractListRepositorio;
import org.steven.poointerfaces.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractListRepositorio<Cliente> {

    @Override
    public void actualizarCliente(Cliente cliente) {
        Cliente c = this.obtenerPorId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public List<Cliente> listarClientes(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
            int resultado = switch (campo) {
                case "id" -> a.getId().compareTo(b.getId());
                case "nombre" -> a.getNombre().compareTo(b.getNombre());
                case "apellido" -> a.getApellido().compareTo(b.getApellido());
                default -> 0;
            };
            return dir == Direccion.DESC ? -resultado : resultado;
        });
        return listaOrdenada;
    }

}
