package ejModelizacionInmuebles;

public class Casa extends InmuebleVivienda {

    private int numPisos;

    public Casa(int id, String direccion, int area, int valorMetroCuadrado, int numHabitaciones, int numBaños, int numPisos) {
        super(id, direccion, area, valorMetroCuadrado, numHabitaciones, numBaños);
        this.numPisos = numPisos;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
}
