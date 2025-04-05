package org.steven.poointerfaces.repositorio;

import org.steven.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listarClientes();
    T obtenerPorId(Integer id);
    void agregarCliente(T cliente);
    void actualizarCliente(T cliente);
    void eliminarCliente(Integer id);
}
