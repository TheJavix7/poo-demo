package ejModelizacionInmuebles;

public class CasaUrbanizacion extends CasaUrbana {

    private int valAdministracion;
    private boolean zonasComunes;

    public CasaUrbanizacion(int id, String direccion, int area, int numHabitaciones, int numBaños, int numPisos, int valAdministracion, boolean zonasComunes) {
        super(id, direccion, area, 2500, numHabitaciones, numBaños, numPisos);
        this.valAdministracion = valAdministracion;
        this.zonasComunes = zonasComunes;
    }

    public int getValAdministracion() {
        return valAdministracion;
    }

    public void setValAdministracion(int valAdministracion) {
        this.valAdministracion = valAdministracion;
    }

    public boolean isZonasComunes() {
        return zonasComunes;
    }

    public void setZonasComunes(boolean zonasComunes) {
        this.zonasComunes = zonasComunes;
    }
}
