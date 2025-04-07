package org.steven;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado <T>{
    private List<T> productos;
    private int max;

    public BolsaSupermercado(int max) {
        this.max = max;
        this.productos = new ArrayList();
    }

    public  void addProduct(T obj) {
        if(this.productos.size() < max){
            this.productos.add(obj);
        }else{
            throw new RuntimeException("No hay mas espacio en la bolsa");

        }
    }

    public List<T> getProduct(T obj) {
        return productos;
    }
}
