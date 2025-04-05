package org.steven.poointerfaces.repositorio;
import org.steven.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio <T> {
    List<T> listarClientes(String campo, Direccion dir);
}
