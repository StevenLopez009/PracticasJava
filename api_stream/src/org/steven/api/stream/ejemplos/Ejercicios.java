package org.steven.api.stream.ejemplos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ejercicios {
    public static void main(String[] args) {
        List<String> nombres = List.of("Ana", "Pedro", "Carlos", "Andrés");
        List<String> nombresFiltrados = nombres.stream()
                .map(String::toUpperCase)
                .filter(nombre -> nombre.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(nombresFiltrados);

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long cantidadPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .count();
        System.out.println("La cantidad de números pares es: " + cantidadPares);

        List<String> palabras = List.of("stream", "lambda", "api", "java");
        List<String> palabrasStream = palabras.stream()
                .filter(letra -> letra.length() > 5)
                .collect(Collectors.toList());

        if (palabrasStream.isEmpty()) {
            System.out.println("No hay palabras con una longitud mayor a 5.");
        } else {
            System.out.println(palabrasStream);
        }

        List<Integer> valores = List.of(5, 10, 15, 20);
        Optional<Integer> valoresStream = valores.stream()
                .reduce((a,b) -> a + b);
        System.out.println(valoresStream.get());

        int[] array100 = new int[100];
        for (int i = 0; i < 100; i++) {
            array100[i] = i + 1;
        }

        double doubleStream = Arrays.stream(array100)
                .filter(numero -> numero % 10 != 0)
                .mapToDouble(n -> n / 2.0)
                .reduce(0.0, (a, b) -> a + b);

        System.out.println(doubleStream);
    }
}
