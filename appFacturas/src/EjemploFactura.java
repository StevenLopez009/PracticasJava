import org.steven.appfacturas.modelo.*;
import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("8888-76");
        cliente.setNombre("Steven");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese descripcion de la factura ");
        String descripcion = entrada.nextLine();
        Factura factura = new Factura(descripcion, cliente);

        Producto producto;
        System.out.println();

        for (int i = 0; i < 2; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto N. " + producto.getCodigo() + ": ");
            producto.setNombre(entrada.nextLine());

            System.out.print("Ingrese precio del producto: ");
            producto.setPrecio(entrada.nextFloat());

            System.out.print("Ingrese cantidad del producto: ");
            ItemFactura item = new ItemFactura(entrada.nextInt(),producto);
            factura.addItemFactura(item);
            System.out.println();
            entrada.nextLine();
        }
        System.out.println(factura);
    }
}
