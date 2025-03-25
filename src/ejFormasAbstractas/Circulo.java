package ejFormasAbstractas;

public class Circulo extends Forma{

    private double raio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.raio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", raio=" + raio +
                '}';
    }
}
