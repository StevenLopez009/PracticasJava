package org.steven.pooclasesabstractas.form;

import org.steven.pooclasesabstractas.form.elementos.*;
import org.steven.pooclasesabstractas.form.validador.*;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("Username");
        username.addValidador(new RequeridoValidador());
        InputForm password = new InputForm("clave", "Password");
        password.addValidador(new RequeridoValidador())
            .addValidador(new LargoValidador(6,12));
        InputForm email = new InputForm("email", "Email");
        email.addValidador(new RequeridoValidador())
            .addValidador(new EmailValidador());
        InputForm edad = new InputForm("edad", "Number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("experiencia", 5,9);
        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion Node = new Opcion("5", "Node");
        lenguaje.addOpcion(new Opcion("1", "Java").setSelected(true));
        lenguaje.addOpcion(new Opcion("2", "Python"));
        lenguaje.addOpcion(new Opcion("3", "PHP"));
        lenguaje.addOpcion(new Opcion("4", "Javascript"));
        lenguaje.addOpcion(Node);

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value='"+this.valor+"'>";
            }
        };

        saludar.setValor("saludo este campo esta deshabilitado");
        username.setValor("");
        password.setValor("547");
        email.setValor("email@gmail.com");
        edad.setValor("26");
        experiencia.setValor("5");

        List<ElementoForm> elementos =  Arrays.asList(
                username,
                  password,
                  email,
                  edad,
                  experiencia,
                  lenguaje,
                  saludar
        );

        for(ElementoForm elemento : elementos){
            System.out.println(elemento.dibujarHtml());
            System.out.println("<br>");
        }
        elementos.forEach(e -> {
            if(!e.esValido()){
                e.getErrores().forEach(System.out::println);
            }
        });
    }
}
