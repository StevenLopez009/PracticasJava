public class Automovil {
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Tanque tanque;
    private TipoAutomovil tipo;
    private Persona conductor;
    private Rueda[] ruedas;

    public static final Integer VELOCIDAD_MAXIMA = 50;

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.motor= motor;
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.tanque = tanque;
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void detalle (){
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("Tipo: " + this.getTipo().getDescripcion());
        System.out.println("Motor: " + this.motor.getCilindrada());
        System.out.println("Ruedas:");
        if (this.ruedas != null) {
            for (int i = 0; i < ruedas.length; i++) {
                System.out.println("  Rueda " + (i + 1) + ": " + ruedas[i]);
            }
        } else {
            System.out.println("  No tiene ruedas asignadas.");
        }
    }

    public String acelerar(int rpm){
        return "El auto " + fabricante +" acelera a" + rpm + "rpm";
    }

}
