package Launcher;
import java.util.Random;

public class Dado {
    private int caraSuperior;
    private static final Random random = new Random(); // numeros aleatorios

    public Dado() {
        //  inicializarlo en 1, no puedo en 0
        this.caraSuperior = 1;
    }

    public void lanzar() {
        this.caraSuperior = random.nextInt(6) + 1; // nextInt(6) genera de 0 a 5
    }

    public int getCaraSuperior() {
        return caraSuperior;
    }
}