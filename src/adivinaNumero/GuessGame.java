package adivinaNumero;

public class GuessGame {

    private int numGuesses;
    private boolean acertado;
    private boolean numLibres[];
    private Player p1;
    private Player p2;
    private Player p3;

    public GuessGame() {
        numGuesses = (int) (Math.random() * 10);
        acertado = false;
        numLibres = new boolean[10];
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
    }

    public void startGame() {

        int numP1;
        int numP2;
        int numP3;

        System.out.println("Vamos a comenzar el juego!!");

        while (!acertado) {

            /* bucle para comprobar el estado de los numeros usados y libres
            for (int i = 0; i < numLibres.length; i++) {
                System.out.println(numLibres[i]);
            }
            */

            System.out.println("Jugador 1, adivina el numero secreto");

            // Aqui hago que cada jugador diga numeros sin parar hasta que diga uno que no se ha usado
            do {
                p1.guess();
                numP1 = p1.getNumero();
            } while (numLibres[numP1]);
            // Una vez encontrado un numero que no se ha usado, lo marcamos True para que no se vuelva a usar
            numLibres[numP1] = true;
            System.out.println("El jugador 1 dice que es: " + numP1);

            System.out.println("Jugador 2, adivina el numero secreto");
            do {
                p2.guess();
                numP2 = p2.getNumero();
            } while (numLibres[numP2]);
            numLibres[numP2] = true;
            System.out.println("El jugador 2 dice que es: " + numP2);

            System.out.println("Jugador 3, adivina el numero secreto");
            do {
                p3.guess();
                numP3 = p3.getNumero();
            } while (numLibres[numP3]);
            numLibres[numP3] = true;
            System.out.println("El jugador 3 dice que es: " + numP3);

            System.out.println("Vamos a comprobar si alguien ha acertado...");

            if (numP1 == numGuesses) {
                System.out.println("El jugador 1 ha acertado el numero secreto \"" + numGuesses + "\" bien hecho!!");
                acertado = true;
            } else if (numP2 == numGuesses) {
                System.out.println("El jugador 2 ha acertado el numero secreto \"" + numGuesses + "\" bien hecho!!");
                acertado = true;
            } else if (numP3 == numGuesses) {
                System.out.println("El jugador 3 ha acertado el numero secreto \"" + numGuesses + "\" bien hecho!!");
                acertado = true;
            } else {
                System.out.println("Ningun jugador ha acertado el numero secreto, siguiente ronda!!");
            }
            System.out.println();
        }
    }

}
