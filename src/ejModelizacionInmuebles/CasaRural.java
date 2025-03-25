package ejModelizacionInmuebles;

public class CasaRural extends Casa {

    private int distCabecera;
    private int altitud;

    public CasaRural(int id, String direccion, int area, int numHabitaciones, int numBaños, int numPisos, int distCabecera, int altitud) {
        super(id, direccion, area, 1500, numHabitaciones, numBaños, numPisos);
        this.distCabecera = distCabecera;
        this.altitud = altitud;
    }

    public int getDistCabecera() {
        return distCabecera;
    }

    public void setDistCabecera(int distCabecera) {
        this.distCabecera = distCabecera;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }
}
