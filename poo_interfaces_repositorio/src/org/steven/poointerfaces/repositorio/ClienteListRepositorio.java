package org.steven.poointerfaces.repositorio;

import org.steven.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio  {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<Cliente>();
    }

    @Override
    public List<Cliente> listarClientes() {
        return dataSource;
    }

    @Override
    public Cliente obtenerPorId(Integer id) {
        Cliente resultado =null;
        for (Cliente cliente : dataSource) {
            if (cliente.getId().equals(id)) {
                resultado = cliente;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void agregarCliente(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        Cliente c = this.obtenerPorId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminarCliente(Integer id) {
        Cliente c = this.obtenerPorId(id);
        this.dataSource.remove(c);
    }


    @Override
    public List<Cliente> listarClientes(String campo, Direccion dir) {
        return List.of();
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return List.of();
    }
}
