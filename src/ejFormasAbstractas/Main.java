package ejFormasAbstractas;

public class Main {

    public static void main(String[] args) {

        Forma[] formas = {new Circulo("Circulo", "Verde", 5), new Cuadrado("Cuadrado", "Azul", 5),
                        new Rectangulo("Rectangulo", "Amarillo", 7, 3), new Triangulo("Triangulo", "Rojo", 5, 7),};

        for (Forma forma : formas) {
            System.out.println(forma);
        }
    }
}
