package org.steven.poointerfaces;

import org.steven.poointerfaces.modelo.Cliente;
import org.steven.poointerfaces.modelo.Producto;
import org.steven.poointerfaces.repositorio.Direccion;
import org.steven.poointerfaces.repositorio.OrdenablePaginableRepositorio;
import org.steven.poointerfaces.repositorio.OrdenableRepositorio;
import org.steven.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {
        OrdenablePaginableRepositorio <Producto> repo = new ProductoListRepositorio();
        repo.agregarCliente(new Producto("Mesa", 50.52));
        repo.agregarCliente(new Producto("Silla",18.0 ));
        repo.agregarCliente(new Producto("notbook", 65.9));
        repo.agregarCliente(new Producto("mouse",54.8 ));

        List<Producto> productos = repo.listarClientes();
        for(Producto prod : productos){
            System.out.println(prod);
        }
        System.out.println("================ Paginable ====================");

        List<Producto> paginable = repo.listar(1,3);
        for(Producto prod : paginable){
            System.out.println(prod);
        }

        System.out.println("================ Ordenar ====================");
        List<Producto>productosOrdenasAsc = repo.listarClientes("descripcion", Direccion.ASC);
        for(Producto prod : productosOrdenasAsc){
            System.out.println(prod);
        }

        System.out.println("================ Editar ====================");
        Producto lamparaActualizar = new Producto("silla de oficina", 23.2 );
        lamparaActualizar.setId(1);
        repo.actualizarCliente(lamparaActualizar);

        Producto silla = repo.obtenerPorId(1);
        System.out.println("====================");
        System.out.println(silla);

        System.out.println("============Eliminar============");
        repo.eliminarCliente(2);
        repo.listarClientes().forEach(System.out::println);

    }
}
