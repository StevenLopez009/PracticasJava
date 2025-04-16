package org.steven.hilos.ejemplos.ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploAgendarTareaTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarea realizada en : " + new Date() + " nombre del Threat: " + Thread.currentThread().getName() );
                timer.cancel();
            }
        }, 5000);
        System.out.println("Agendamos una tarea para 5 segundos mas ...");
    }
}
