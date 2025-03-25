package ejModelizacionInmuebles;

public class Apartamento extends InmuebleVivienda {

    private int valAdministracion;

    public Apartamento(int id, String direccion, int area, int valorMetroCuadrado, int numHabitaciones, int numBaños, int valAdministracion) {
        super(id, direccion, area, valorMetroCuadrado, numHabitaciones, numBaños);
        this.valAdministracion = valAdministracion;
    }

    public int getValAdministracion() {
        return valAdministracion;
    }

    public void setValAdministracion(int valAdministracion) {
        this.valAdministracion = valAdministracion;
    }
}
