package org.steven.patrones.factory.producto;

import org.steven.patrones.factory.PizzaProducto;

public class PizzaNewYorkPepperoni extends PizzaProducto {

    public PizzaNewYorkPepperoni() {
        super();
        nombre = "Pizza New York Pepperoni";
        masa="Masa delgada";
        salsa="Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Pepperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinar Pizza New York Pepperoni 40min 40g");
    }

    @Override
    public void cortar() {
        System.out.println("Cortar Pizza New York Pepperoni en triangulos");
    }
}
