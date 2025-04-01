package org.steven.poointerfaces.repositorio;

import org.steven.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listarClientes();
    Cliente obtenerPorId(Integer id);
    void agregarCliente(Cliente cliente);
    void actualizarCliente(Cliente cliente);
    void eliminarCliente(Integer id);
}
