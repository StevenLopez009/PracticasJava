package org.steven.ejemplos.map;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejercicio {
    public static void main(String[] args) {
        List<Vuelo> fly = new ArrayList<>();

        LocalDate fecha1 = LocalDate.of(2021, 8, 29);
        LocalDate fecha2 = LocalDate.of(2021, 8, 30);
        LocalDate fecha3 = LocalDate.of(2021, 8, 31);

        LocalTime hora1 = LocalTime.of(5, 39);
        LocalTime hora2 = LocalTime.of(4, 45);
        LocalTime hora3 = LocalTime.of(16, 0);
        LocalTime hora4 = LocalTime.of(13, 22);
        LocalTime hora5 = LocalTime.of(14, 5);
        LocalTime hora6 = LocalTime.of(5, 20);
        LocalTime hora7 = LocalTime.of(8, 45);
        LocalTime hora8 = LocalTime.of(7, 41);
        LocalTime hora9 = LocalTime.of(10, 35);
        LocalTime hora10 = LocalTime.of(9, 14);
        LocalTime hora11 = LocalTime.of(8, 33);
        LocalTime hora12 = LocalTime.of(15, 15);
        LocalTime hora13 = LocalTime.of(8, 14);
        LocalTime hora14 = LocalTime.of(22, 53);
        LocalTime hora15 = LocalTime.of(9, 57);
        LocalTime hora16 = LocalTime.of(4, 0);
        LocalTime hora17 = LocalTime.of(7, 45);
        LocalTime hora18 = LocalTime.of(7, 12);
        LocalTime hora19 = LocalTime.of(18, 29);
        LocalTime hora20 = LocalTime.of(15, 45);


        fly.add(new Vuelo("AAL933", "New York", "Santiago",fecha1, hora1, 62 ));
        fly.add(new Vuelo("LAT755", "Sao Paulo", "Santiago",fecha3, hora2, 47 ));
        fly.add(new Vuelo("SKU621", "Rio De Janeiro", "Santiago",fecha2, hora3, 52 ));
        fly.add(new Vuelo("DAL147", "Atlanta", "Santiago",fecha1, hora4, 59 ));
        fly.add(new Vuelo("AVA241", "Bogota", "Santiago",fecha3, hora5, 25 ));
        fly.add(new Vuelo("AMX10", "Mexico City", "Santiago",fecha3, hora6, 29 ));
        fly.add(new Vuelo("IBE6833", "Londres", "Santiago",fecha2, hora7, 55 ));
        fly.add(new Vuelo("LAT2479", "Frankfurt", "Santiago",fecha1, hora8, 51 ));
        fly.add(new Vuelo("SKU803", "Lima", "Santiago",fecha2, hora9, 48 ));
        fly.add(new Vuelo("LAT533", "Los Angeles", "Santiago",fecha1, hora10, 59 ));
        fly.add(new Vuelo("LAT1447", "Guayaquil", "Santiago",fecha3, hora11, 31 ));
        fly.add(new Vuelo("CMP111", "Panama City", "Santiago",fecha3, hora12, 29 ));
        fly.add(new Vuelo("LAT705", "Madrid", "Santiago",fecha2, hora13, 47 ));
        fly.add(new Vuelo("AAL957", "Miami", "Santiago",fecha1, hora14, 60 ));
        fly.add(new Vuelo("ARG5091", "Buenos Aires", "Santiago",fecha3, hora15, 32 ));
        fly.add(new Vuelo("LAT1283", "Cancun", "Santiago",fecha3, hora16, 35 ));
        fly.add(new Vuelo("LAT579", "Barcelona", "Santiago",fecha1, hora17, 61 ));
        fly.add(new Vuelo("AAL945", "Dallas fort worth", "Santiago",fecha2, hora18, 58 ));
        fly.add(new Vuelo("LAT501", "Paris", "Santiago",fecha1, hora19, 49 ));
        fly.add(new Vuelo("LAT405", "Montevideo", "Santiago",fecha2, hora20, 39 ));


        System.out.println(fly);
        fly.sort(Comparator.reverseOrder(fly));
    }

}
