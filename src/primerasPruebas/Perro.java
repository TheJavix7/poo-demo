package primerasPruebas;

public class Perro {

    private int tamano;
    private String raza;
    private String nombre;

    public Perro(int tamano, String raza, String nombre) {
        this.tamano = tamano;
        this.raza = raza;
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ladrar(){
        System.out.println(nombre + " ladradno");
    }
}
