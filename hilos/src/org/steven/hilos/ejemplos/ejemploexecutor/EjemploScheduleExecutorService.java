package org.steven.hilos.ejemplos.ejemploexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduleExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        System.out.println("Alguna tarea en main");
        executor.schedule(()->{
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hola tarea desde el executor");
        }, 0, TimeUnit.MILLISECONDS);
        System.out.println("Otra Tarea");
        executor.shutdown();
    }
}
