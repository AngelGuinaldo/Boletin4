package boletin4_1;

public class Coche {

    private int velocidade;

    public Coche() {
        velocidade = 0;
    }

    public int setVelocidade() {
        return velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(int ac) {

        velocidade = velocidade + ac;
    }

    public void frenar(int fre) {

        velocidade = velocidade - fre;
    }

}