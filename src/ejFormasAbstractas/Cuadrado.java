package ejFormasAbstractas;

public class Cuadrado extends Forma{

    private double lado;

    public Cuadrado(String nombre, String color, double lado) {
        super(nombre, color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", lado=" + lado +
                '}';
    }
}
