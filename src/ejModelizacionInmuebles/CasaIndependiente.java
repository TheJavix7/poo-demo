package ejModelizacionInmuebles;

public class CasaIndependiente extends CasaUrbana {

    public CasaIndependiente(int id, String direccion, int area, int numHabitaciones, int numBaños, int numPisos) {
        super(id, direccion, area, 3000, numHabitaciones, numBaños, numPisos);
    }
}
