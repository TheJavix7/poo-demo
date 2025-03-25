package primerasPruebas;

public class MainTest {

    public static void main(String[] args) {

        int numero1 = 0;
        int numero2 = 0;

        Calculadora calculadora = new Calculadora(numero1, numero2);

        Perro perro1 = new Perro(30, "beagle", "Toby");
        perro1.ladrar();

        Pelicula pelicula1 = new Pelicula("Interestellar", "Ciencia Ficcion", 10);
        pelicula1.repdroduciendo();
        ;
    }

}
