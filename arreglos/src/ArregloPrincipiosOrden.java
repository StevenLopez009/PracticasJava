public class ArregloPrincipiosOrden {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int [] numerosOrdenados = new int [10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i +1;
        }

        int aux = 0;
        for (int i = 0; i < numeros.length/2; i++) {
            numerosOrdenados[aux ++] = numeros[i];
            numerosOrdenados[aux ++] = numeros[numerosOrdenados.length - i - 1];
            //System.out.print(numeros[i] );
            //System.out.println(numeros[numeros.length-1-i]);
        }
        for (int i = 0; i < numerosOrdenados.length; i++) {
            System.out.println(numerosOrdenados[i]);
        }

    }
}
