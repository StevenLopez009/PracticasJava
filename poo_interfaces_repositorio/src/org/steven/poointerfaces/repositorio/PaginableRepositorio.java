package org.steven.poointerfaces.repositorio;
import org.steven.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio <T> {
    List<T> listar(int desde, int hasta);
}
