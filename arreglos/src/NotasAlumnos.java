import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {

        double [] claseMatematicas, claseHistoria, claseLenguaje;

        claseMatematicas = new double [7];
        claseHistoria = new double [7];
        claseLenguaje = new double [7];

        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las 7 notas de los alumnos para Matematicas: :");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = sc.nextDouble();
        }
        System.out.println("Ingrese las 7 notas de los alumnos para Historia: :");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = sc.nextDouble();
        }
        System.out.println("Ingrese las 7 notas de los alumnos para Lenguaje: :");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = sc.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }
        double PromedioMatematicas = (sumNotasMatematicas/claseMatematicas.length);
        double PromedioHistoria = (sumNotasHistoria/claseHistoria.length);
        double PromedioLenguaje = (sumNotasLenguaje/claseLenguaje.length);

        System.out.println("Promedio Matematicas: " + PromedioMatematicas );
        System.out.println("Promedio Historia: " + PromedioHistoria );
        System.out.println("Promedio Lenguaje: " + PromedioLenguaje);
        System.out.println("Promedio del Curso" + (PromedioLenguaje+ PromedioMatematicas+ PromedioHistoria)/3 );

        System.out.println("Ingrese el identificador del alumno (de 0 -6 )");
        int id = sc.nextInt();
        double promedioAlumno = (claseMatematicas[id]+claseHistoria[id]+claseLenguaje[id])/3;
        System.out.println("promedioAlumno = " + promedioAlumno);
    }
}
