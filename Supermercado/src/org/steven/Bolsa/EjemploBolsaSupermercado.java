package org.steven.Bolsa;

import org.steven.BolsaSupermercado;
import org.steven.productos.Fruta;
import org.steven.productos.Lacteo;

public class EjemploBolsaSupermercado {
    public static void main(String[] args) {
        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>(5);
        bolsaFrutas.addProduct(new Fruta("Manzana", 12.0, 200, "Verde"));

        BolsaSupermercado<Lacteo> bolsaLacteo = new BolsaSupermercado<>(5);
        bolsaLacteo.addProduct(new Lacteo("Leche parmalat", 12.6, 2, 120));


    }
}
