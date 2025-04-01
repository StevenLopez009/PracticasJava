import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        String[] productos = new String[7];

        int total = productos.length;

        productos[0] = "Pepsi";
        productos[1] = "Milk";
        productos[2] =  "Coffe";
        productos[3] = "Eggs";
        productos[4] = "Breed";
        productos[5] = "Lechuga";
        productos[6] = "Chicken";

        Arrays.sort(productos);
        System.out.println("======  Usando For ===========");
        for (int i = 0; i <=total-1 ; i++) {
            System.out.println("para indice" + i + ": " + productos[i]);
        }

        System.out.println("======  Usando For Each ===========");
        for(String prod: productos) {
            System.out.println(prod);
        }

        System.out.println("======  Usando While ===========");
        int i = 0;
        while(i< total) {
            System.out.println(productos[i]);
            i++;
        }

        //Arrays.sort(productos);

        int [] numeros = new int [10];



    }
}
