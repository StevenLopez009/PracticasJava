package org.steven.pooclasesabstractas.form.elementos;
import org.steven.pooclasesabstractas.form.validador.LargoValidador;
import org.steven.pooclasesabstractas.form.validador.Validador;
import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {
    protected String valor;
    protected String nombre;
    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido() {
        for (Validador validador : validadores) {
            if(!validador.esValido(this.valor)){
                if(validador instanceof LargoValidador){
                    this.errores.add(((LargoValidador)validador).getMensajeFormateado(nombre));
                }else{
                    this.errores.add(String.format(validador.getMensaje(), nombre));
                }

            }
        }
        return this.errores.isEmpty();
    }

    abstract public String dibujarHtml();
}
