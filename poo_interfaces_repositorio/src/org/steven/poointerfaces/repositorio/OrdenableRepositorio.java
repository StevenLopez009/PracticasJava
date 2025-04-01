package org.steven.poointerfaces.repositorio;
import org.steven.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listarClientes(String campo, Direccion dir);
}
