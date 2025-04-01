public class EjerciciosArrays {
    public static void main(String[] args) {

        int[] numeros = {1, 4, 7, 8, 9};
        double[] decimales = {1.5, 2.75, 3.14, 4.0};

        int total = 0;
        int mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
             total += numeros[i];
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("Total Array"+ "  " +  total);
        System.out.println("Numero Mayor" + " " + mayor);


        double totalDecimales = 0.0;
        for (int i = 0; i < decimales.length; i++) {
            totalDecimales = totalDecimales += decimales[i];
        }
        double promedio = totalDecimales/decimales.length;
        System.out.println("Promedio" + " " + promedio);


        int numeroBuscado = 7;
        boolean encontrado = false; // Variable para saber si lo encontramos

        for (int i = 0; i < numeros.length; i++) {
            if (numeroBuscado == numeros[i]) {
                encontrado = true; // Se encontró el número
                break; // Salimos del bucle porque ya lo hallamos
            }
        }

        // Mensaje después de recorrer todo el array
        if (encontrado) {
            System.out.println("El número buscado SÍ se encuentra en el array.");
        } else {
            System.out.println("El número buscado NO se encuentra en el array.");
        }

    }
}

