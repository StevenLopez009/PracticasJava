package Ejercicios12Mayo.Rectangulo;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularPerimetro() {
        int perimetro = 2 * (base + altura);
        System.out.println("El perimetro del rectángulo es: " + perimetro);
    }

    public void calcularArea() {
        int area = base*altura;
        System.out.println("El área del rectángulo es: " + area);
    }

}
