import java.util.Scanner;

public class EliminarElemento {
    public static void main(String[] args) {
        int [] a = new int [10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduzca un numero: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Ingrese una posicion a eliminar: ");
        int posicion = sc.nextInt();
        for (int i = posicion; i < a.length -1; i++) {
            a[i] = a[i +1];
        }
        for (int i = 0; i<a.length;i++) {
            System.out.println(a[i]);
        }
        int[]b = new int[a.length-1];
        System.arraycopy(a,0,b,0,b.length);

        for (int i = 0;i < b.length ;i ++) {
            System.out.println(b[i]);
        }
    }
}

