package adivinaNumero;

public class Player {

    private int numero;

    public Player() {
    }

    public int getNumero() {
        return numero;
    }

    public void guess(){
        numero = (int)(Math.random()*10);
    }
}
