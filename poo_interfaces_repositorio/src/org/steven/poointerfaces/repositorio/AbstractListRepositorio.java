package org.steven.poointerfaces.repositorio;

import org.steven.poointerfaces.modelo.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepositorio <T extends BaseEntity> implements OrdenablePaginableRepositorio <T>  {

    protected List<T> dataSource;

    public AbstractListRepositorio() {
        this.dataSource = new ArrayList<T>();
    }

    @Override
    public List<T> listarClientes() {
        return dataSource;
    }

    @Override
    public T obtenerPorId(Integer id) {
        T resultado =null;
        for (T cliente : dataSource) {
            if (cliente.getId().equals(id)) {
                resultado = cliente;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void agregarCliente(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void eliminarCliente(Integer id) {
        this.dataSource.remove(this.obtenerPorId(id));
    }


    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }
}
