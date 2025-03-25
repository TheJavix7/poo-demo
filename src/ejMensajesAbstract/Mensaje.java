package ejMensajesAbstract;

public class Mensaje {

    private String mensaje;
    private Medio medio;

    public Mensaje(String mensaje, Medio medio) {
        this.mensaje = mensaje;
        this.medio = medio;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
