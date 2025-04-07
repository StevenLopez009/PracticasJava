package org.steven.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        String denominador = JOptionPane.showInputDialog("Digite un entero denominador ");
        String numerador = JOptionPane.showInputDialog("Digite un entero numerador ");

        try{
            double division2 = calc.dividir(numerador,denominador);
            System.out.println(division2);
        }catch (DivisionPorZeroException e){
            System.out.println("Capturamos la excepcion en tiempo de ejecucion " + e.getMessage());
        }catch (FormatoNumeroException e){
            System.out.println("Ingrese un numero valido " + e.getMessage());
        }
    }
}
