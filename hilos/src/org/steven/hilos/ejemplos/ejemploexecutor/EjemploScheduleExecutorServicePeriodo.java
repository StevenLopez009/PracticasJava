package org.steven.hilos.ejemplos.ejemploexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduleExecutorServicePeriodo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        System.out.println("Alguna tarea en main");
        executor.scheduleAtFixedRate(()->{
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hola tarea desde el executor");
        }, 1000,2000, TimeUnit.MILLISECONDS);
        TimeUnit.SECONDS.sleep(10);
        System.out.println("Otra Tarea");
        executor.shutdown();
    }
}
