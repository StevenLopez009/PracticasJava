import java.util.Scanner;

public class BuscarEnteros {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite um numero: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Digite um numero a buscar: ");
        int num = sc.nextInt();
        int i = 0;
        while (i < a.length && a[i] != num) {
            i++;
        }
        if (i == a.length) {
            System.out.println("No Encontrado");
        } else if (a[i] == num) {
            System.out.println("Encontrado en la posicion"+ i);
        }
    }
}
