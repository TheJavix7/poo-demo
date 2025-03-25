package ejModelizacionInmuebles;

public class Oficina extends Local {

    private boolean gobierno;

    public Oficina(int id, String direccion, int area, Localizacion localizacion, boolean gobierno) {
        super(id, direccion, area, 3500, localizacion);
        this.gobierno = gobierno;
    }

    public boolean isGobierno() {
        return gobierno;
    }

    public void setGobierno(boolean gobierno) {
        this.gobierno = gobierno;
    }
}
