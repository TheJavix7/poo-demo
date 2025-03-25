package primerasPruebas;

public class Pelicula {

    private String titulo;
    private String genero;
    private int valoracion;

    public Pelicula(String titulo, String genero, int valoracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.valoracion = valoracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public void repdroduciendo(){
        System.out.println("Reproduciendo " + titulo);
    }
}
