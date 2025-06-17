package Launcher;
public class JuegoDeDados {
    private Dado dado1;
    private Dado dado2;
    private Suma sumador; // 'sumador' o 'suma'

    public JuegoDeDados() {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
        this.sumador = new Suma();
    }

    // constructor para  el sumador, mejor para  el test
    public JuegoDeDados(Suma sumador) {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
        this.sumador = sumador;
    }


    public String jugar() {
        dado1.lanzar();
        dado2.lanzar(); //simula

        int suma = sumador.sumar(dado1.getCaraSuperior(), dado2.getCaraSuperior()); // usa sumador
        System.out.println("Dado 1: " + dado1.getCaraSuperior() + ", Dado 2: " + dado2.getCaraSuperior() + ", Suma: " + suma);

        if (suma == 7) {
            return "Ganaste, la suma es 7";
        } else {
            return "Lo siento, perdiste, la suma no es 7";
        }
    }


    public int getSumaCaras() {
        return sumador.sumar(dado1.getCaraSuperior(), dado2.getCaraSuperior());
    }

    // Getters para acceder a los dados
    public Dado getDado1() {
        return dado1;
    }

    public Dado getDado2() {
        return dado2;
    }
}
