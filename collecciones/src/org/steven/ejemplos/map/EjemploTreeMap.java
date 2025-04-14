package org.steven.ejemplos.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new TreeMap<>();
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("email", "john@doe.com");
        persona.put("edad", "29");

        Map<String,String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "CA");
        direccion.put("ciudad", "UK");
        direccion.put("calle", "0ne street");

        persona.put("direccion", direccion);


        System.out.println(persona);
        String nombre = (String) persona.get("nombre");
        System.out.println(nombre);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String estado = direccionPersona.get("estado");
        String ciudad = direccionPersona.get("ciudad");

        System.out.println(pais);
        System.out.println(estado);
        System.out.println(ciudad);

    }
}
