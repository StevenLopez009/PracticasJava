package org.steven.patrones.factory.producto;

import org.steven.patrones.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super();
        nombre = "Pizza New York Vegetariana";
        masa= "Masa integral vegana";
        salsa= "Salsa tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Espinacas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinar Pizza New York Vegetariana 25min 45g");
    }

    @Override
    public void cortar() {
        System.out.println("Cortar Pizza New York Vegetariana en cuadro");
    }
}
