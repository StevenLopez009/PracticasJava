package org.steven.poointerfaces.repositorio;

public interface OrdenablePaginableRepositorio <T> extends OrdenableRepositorio  <T>, PaginableRepositorio  <T>, CrudRepositorio <T> {
}
