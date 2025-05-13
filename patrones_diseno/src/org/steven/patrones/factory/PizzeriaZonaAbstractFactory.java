package org.steven.patrones.factory;

abstract public class PizzeriaZonaAbstractFactory {
    public PizzaProducto orderPizza(String tipo) {
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("Fabricando la pizza"+ pizza.getNombre());
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empacar();

        return pizza;
    }

    abstract PizzaProducto crearPizza(String tipo);

}
