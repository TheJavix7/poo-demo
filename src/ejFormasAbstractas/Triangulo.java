package ejFormasAbstractas;

public class Triangulo extends Forma{

    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base*altura/2;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
