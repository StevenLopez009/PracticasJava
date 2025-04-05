package org.steven.poointerfaces;
import org.steven.poointerfaces.modelo.Cliente;
import org.steven.poointerfaces.repositorio.*;
import org.steven.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        OrdenablePaginableRepositorio <Cliente> repo = new ClienteListRepositorio();
        repo.agregarCliente(new Cliente("Bea", "Gonzales"));
        repo.agregarCliente(new Cliente("Bob", "Gonzales"));
        repo.agregarCliente(new Cliente("Alice", "Gonzales"));
        repo.agregarCliente(new Cliente("Andres", "Guzman"));

        List<Cliente> clientes = repo.listarClientes();
        for(Cliente cli : clientes){
            System.out.println(cli);
        }
        System.out.println("================ Paginable ====================");

        List<Cliente> paginable = repo.listar(1,3);
        for(Cliente cli : paginable){
            System.out.println(cli);
        }

        System.out.println("================ Ordenar ====================");
        List<Cliente>clientesOrdenasAsc = repo.listarClientes("nombre", Direccion.ASC);
        for(Cliente cli : clientesOrdenasAsc){
            System.out.println(cli);
        }

        System.out.println("================ Editar ====================");
        Cliente beaActualizar = new Cliente("Bea", "Sanchez");
        beaActualizar.setId(2);
        repo.actualizarCliente(beaActualizar);
        Cliente bea = repo.obtenerPorId(2);
        System.out.println("====================");
        System.out.println(bea);
        ((OrdenableRepositorio)repo)
                .listarClientes("apellido", Direccion.ASC).forEach(System.out::println);

        System.out.println("============Eliminar============");
        repo.eliminarCliente(2);
        repo.listarClientes().forEach(System.out::println);

    }
}
