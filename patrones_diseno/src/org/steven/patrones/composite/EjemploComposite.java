package org.steven.patrones.composite;

public class EjemploComposite {
    public static void main(String[] args) {
        Directorio doc = new Directorio("Documentos");

        Directorio java = new Directorio("Java");
        java.addComponente(new Archivo("patron-composite.docx"));

        Directorio stream = new Directorio("stream");
        stream.addComponente(new Archivo("stream-map.txt"));

        java.addComponente(stream);
        doc.addComponente(java);

        System.out.println(doc.mostrar());
    }
}
