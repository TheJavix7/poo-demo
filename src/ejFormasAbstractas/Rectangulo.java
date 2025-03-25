package ejFormasAbstractas;

public class Rectangulo extends Forma {

    private double ancho;
    private double alto;

    public Rectangulo(String nombre, String color, double ancho, double alto) {
        super(nombre, color);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
