package org.steven.hilos.ejemplos.ejemplosync;

public class Panaderia {
    private String pan;
    private boolean disponible;

    public synchronized void hornear (String masa){
        while (disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.pan = masa;
        System.out.println("Panadero hornea: " + pan);
        disponible = true;
        notifyAll();
    }

    public synchronized String consumir() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cliente consume: " + pan);
        this.disponible = false;
        notifyAll();
        return pan;
    }
}
