package org.steven.patrones.factory.ejemplo;
import org.steven.patrones.factory.PizzaProducto;
import org.steven.patrones.factory.PizzeriaNewYorkFactory;
import org.steven.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory NewYork = new PizzeriaNewYorkFactory();

        PizzaProducto pizza = NewYork.orderPizza("pepperoni");
        System.out.println("Ordene la pizza "+ pizza.getNombre());
    }
}
