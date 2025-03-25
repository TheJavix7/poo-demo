package ejModelizacionInmuebles;

public class LocalComercial extends Local {

    private String centroComercial;

    public LocalComercial(int id, String direccion, int area, Localizacion localizacion, String centroComercial) {
        super(id, direccion, area, 3000, localizacion);
        this.centroComercial = centroComercial;
    }

    public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }
}
