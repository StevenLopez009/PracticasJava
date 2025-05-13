package Ejercicios12Mayo.Inventario;

public class EjemploInventario {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("Asus Rog", "portatil", 3000));
        inventario.agregarProducto(new Producto("Apple", "portatil", 4000));

        Producto productoBuscado =inventario.buscarProductoPorNombre("Apple");
        if(productoBuscado != null){
            System.out.println("Se encontro el producto "+ productoBuscado.getNombre());
        }else{
            System.out.println("No se encontro el producto "+ productoBuscado.getNombre());
        }
        inventario.getProductos().forEach(System.out::println);

    }
}
