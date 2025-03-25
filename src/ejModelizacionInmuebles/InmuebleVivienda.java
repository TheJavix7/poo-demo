package ejModelizacionInmuebles;

public class InmuebleVivienda extends Inmueble {

    private int numHabitaciones;
    private int numBaños;

    public InmuebleVivienda(int id, String direccion, int area, int valorMetroCuadrado, int numHabitaciones, int numBaños) {
        super(id, direccion, area, valorMetroCuadrado);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBaños() {
        return numBaños;
    }

    public void setNumBaños(int numBaños) {
        this.numBaños = numBaños;
    }

}
