import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(int i=0; i<=100; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        //numero primo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if(esPrimo(number)){
            System.out.println("Es un numero Primo");
        }else {
            System.out.println("No es numero Primo");
        }
        //tabla de multiplicar
        System.out.println("Que tabla de multiplicar quieres");
        int multiplo = scanner.nextInt();

        for(int i = 0; i<= 10; i++){
            System.out.println(multiplo + "*" + i + "="+ multiplo*i);
        }
        //dos números y una operación
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scann.nextInt();
        System.out.println("Enter a second number: ");
        int num2 = scann.nextInt();
        System.out.println("Enter a operation: ");
        char operacion = scanner.next().charAt(0);

        double resultado;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: división por cero");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }

        // Calcular el factorial
        System.out.println("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));

        //Fibonacci
        int numFibonacci= 23;
        for (int i = 0; i < numFibonacci; i++) {
            System.out.println( fibonacci(i));
        }

        // palindromo
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = scan.nextLine();

        String invertida = new StringBuilder(palabra).reverse().toString();
        if (palabra.equalsIgnoreCase(invertida)) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }

        scan.close();

    }
    public static boolean esPrimo(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }

    public static int factorial(int n) {
        if(n<=1) return 1;
        return n*factorial(n-1);
    }

   public static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
   }

}