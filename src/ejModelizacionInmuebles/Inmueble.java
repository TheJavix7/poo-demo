package ejModelizacionInmuebles;

public class Inmueble {

    private int id;
    private int area;
    private String direccion;
    private int valorMetroCuadrado;
    private double valorCompra;

    public Inmueble(int id, String direccion, int area, int valorMetroCuadrado) {
        this.id = id;
        this.direccion = direccion;
        this.area = area;
        this.valorMetroCuadrado = valorMetroCuadrado;
        valorCompra = area * valorMetroCuadrado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public int getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void cambiarValorCompra(int valorMetro2) {
        valorMetroCuadrado = valorMetro2;
        valorCompra = area * valorMetroCuadrado;
    }

}
