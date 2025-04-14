package org.steven.hilos.ejemplos;


public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) {
        Runnable viaje = () -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + ": " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Finalmente me voy de viaje a : " + Thread.currentThread().getName());
        };

        Thread v1 = new Thread(viaje,"Alemania");
        Thread v2 = new Thread(viaje, "Colombia");
        Thread v3 = new Thread(viaje, "España");
        Thread v4 = new Thread(viaje, "Francia");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        try {
            v1.join();
            v2.join();
            v3.join();
            v4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Continuando con la ejecucion del metodo main");

    }
}
