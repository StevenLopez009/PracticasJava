package org.steven.hilos.ejemplos.ejemploexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class EjemploExecutorFuture {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Runnable task = () -> { 
            System.out.println("Iniciando task");
            try {
                System.out.println("Nombre del thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            } 
            System.out.println("Terminando task");
        };
        Future<?> resultados = executor.submit(task);
        executor.shutdown();
        System.out.println("Continuando con la ejecución del método main");
        System.out.println(resultados.isDone());
    }
}
