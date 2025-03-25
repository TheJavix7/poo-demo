package ejModelizacionInmuebles;

public class Local extends Inmueble {

    private Localizacion localizacion;

    public Local(int id, String direccion, int area, int valorMetroCuadrado, Localizacion localizacion) {
        super(id, direccion, area, valorMetroCuadrado);
        this.localizacion = localizacion;
    }

    public String getLocalizacion() {
        return localizacion.name();
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }
}
