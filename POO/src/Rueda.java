public class Rueda {
    private String fabricante;
    private int radio;
    private double ancho;

    public Rueda(String fabricante, int radio, double ancho) {
        this.fabricante = fabricante;
        this.radio = radio;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "fabricante='" + fabricante + '\'' +
                ", radio=" + radio +
                ", ancho=" + ancho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getRadio() {
        return radio;
    }

    public double getAncho() {
        return ancho;
    }
}
