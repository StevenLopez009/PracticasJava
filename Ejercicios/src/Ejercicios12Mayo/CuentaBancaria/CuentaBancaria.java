package Ejercicios12Mayo.CuentaBancaria;

public class CuentaBancaria {
    public String titular;
    public double saldo;

    public double getSaldo() {
        return saldo;
    }

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void retirar(double valor) {
        this.saldo = this.saldo - valor;
    }
}
