package org.steven.api.stream.ejemplos;
import org.steven.api.stream.ejemplos.models.Factura;
import org.steven.api.stream.ejemplos.models.Usuario;
import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("John", "Doe");
        Usuario usuario2 = new Usuario("Jane", "Doe");
        Usuario usuario3 = new Usuario("Jack", "Doe");
        Usuario usuario4 = new Usuario("Jane", "Doe");

        usuario1.addFactura(new Factura("Descripcion compra tecnologia"));
        usuario1.addFactura(new Factura("Descripcion compra jardineria"));
        usuario2.addFactura(new Factura("Descripcion compra cama"));
        usuario2.addFactura(new Factura("Descripcion compra sala"));

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2);

        usuarios.stream()
                .flatMap(usuario -> usuario.getFacturas().stream())
                .forEach(factura -> System.out.println(factura.getDescripcion().concat(": cliente ")
                        .concat(factura.getUsuario().getNombre())));
    }
}
