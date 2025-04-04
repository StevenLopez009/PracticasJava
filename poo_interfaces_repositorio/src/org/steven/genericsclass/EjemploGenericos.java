package org.steven.genericsclass;

public class EjemploGenericos {
    public static <T> void imprimirCamion(Camion<T> camion){
        for (T a : camion) {
            if(a instanceof Animal){
                System.out.println(((Animal)a).getNombre() + " tipo: " + ((Animal)a).getTipo());
            } else if (a instanceof Automovil) {
                System.out.println(((Automovil)a).getMarca() );
            } else if (a instanceof Maquinaria) {
                System.out.println(((Maquinaria)a).getTipo() );
            }

        }
    }
    public static void main(String[] args) {
        Camion <Animal> trasporteCaballos = new Camion<>(5);

        trasporteCaballos.add(new Animal("Pepe", "Caballo"));
        trasporteCaballos.add(new Animal("fito", "Caballo"));
        trasporteCaballos.add(new Animal("grillo", "Caballo"));
        trasporteCaballos.add(new Animal("spring", "Caballo"));
        trasporteCaballos.add(new Animal("fita", "Caballo"));

        for (Animal a : trasporteCaballos) {
            System.out.println(a.getNombre() + " tipo: " + a.getTipo());
        }


        Camion <Maquinaria> transMaquinas = new Camion<>(1);
        transMaquinas.add(new Maquinaria("Grua"));
        imprimirCamion(transMaquinas);

        Camion<Automovil> transAutomovil = new Camion<>(1);
        transAutomovil.add(new Automovil("Audi"));
        imprimirCamion(transAutomovil);
    }
}
