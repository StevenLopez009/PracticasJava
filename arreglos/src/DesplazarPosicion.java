import java.util.Arrays;

public class DesplazarPosicion {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};

        int lastPosition = arreglo[arreglo.length - 1];

        for (int i = arreglo.length - 1; i > 0; i--) {
            arreglo[i] = arreglo[i - 1];
        }
        arreglo[0] = lastPosition;

        // Imprimir índices y valores
        System.out.println("Índices y valores después del desplazamiento:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Índice " + i + " → " + arreglo[i]);
        }
    }
}
