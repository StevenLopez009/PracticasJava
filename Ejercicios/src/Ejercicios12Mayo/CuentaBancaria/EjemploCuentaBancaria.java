package Ejercicios12Mayo.CuentaBancaria;

public class EjemploCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuentaOne = new CuentaBancaria("Steven", 450.00);
        cuentaOne.depositar(100.00);
        cuentaOne.depositar(400.00);
        cuentaOne.retirar(50.00);
        System.out.println(cuentaOne.getSaldo());
    }
}
