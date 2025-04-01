import java.util.Scanner;

public class DesplazarPosicionInteracmbio {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        int elemento, posicion;
        Scanner entrada = new Scanner(System.in);

        // Llenamos el array completo
        for (int i = 0; i < arreglo. length-1; i++) {
            System.out.print("Ingrese un número: ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.println();

        System.out.print("Ingrese un nuevo elemento: ");
        elemento = entrada.nextInt(); // Guardamos el último elemento

        System.out.print("Posicion donde agregar el nuevo elemento: ");
        posicion = entrada.nextInt();

        // Desplazamos los elementos hacia la derecha
        for (int i = arreglo.length - 2; i >= posicion; i--) {
            arreglo[i] = arreglo[i - 1];
        }

        arreglo[posicion] = elemento;

        // Imprimir índices y valores
        System.out.println("\nÍndices y valores después del desplazamiento:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Índice " + i + " → " + arreglo[i]);
        }
    }
}

