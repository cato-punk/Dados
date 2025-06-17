package Launcher;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JuegoDeDadosTest {

    private JuegoDeDados juegoDeDados;
    private Suma sumador; //

    @BeforeEach
    void setUp() {
        // instancia un nuevo sumador para cada test
        sumador = new Suma();
        //  nueva instancia de JuegoDeDados antes de cada test
        juegoDeDados = new JuegoDeDados(sumador); // Cambiado a 'sumador'
    }

    @Test
    @DisplayName("La suma de los dados debe estar entre 2 y 12")
    void testSumaDadosRangoValido() {
        for (int i = 0; i < 100; i++) {
            juegoDeDados.jugar();
            int suma = juegoDeDados.getSumaCaras();
            assertTrue(suma >= 2 && suma <= 12, "La suma de los dados debe estar entre 2 y 12");
        }
    }

    @Test
    @DisplayName("El juego debe detectar correctamente una victoria (suma 7)")
    void testJuegoDetectaVictoria() {
        // ... (No necesita cambios)
        boolean victoriaEncontrada = false;
        for (int i = 0; i < 1000; i++) {
            String resultado = juegoDeDados.jugar();
            if (resultado.contains("Ganaste")) {
                victoriaEncontrada = true;
                break;
            }
        }
        assertTrue(victoriaEncontrada, "El juego debería permitir ganar si la suma es 7");
    }

    @Test
    @DisplayName("El juego debe detectar correctamente una derrota (suma diferente de 7)")
    void testJuegoDetectaDerrota() {
        // ... (No necesita cambios)
        boolean derrotaEncontrada = false;
        for (int i = 0; i < 1000; i++) {
            String resultado = juegoDeDados.jugar();
            if (resultado.contains("perdiste") && juegoDeDados.getSumaCaras() != 7) {
                derrotaEncontrada = true;
                break;
            }
        }
        assertTrue(derrotaEncontrada, "El juego debería permitir perder si la suma no es 7");
    }

    @Test
    @DisplayName("La clase Suma debe sumar correctamente") // Cambiado el DisplayName
    void testSumaClaseSuma() {
        assertEquals(5, sumador.sumar(2, 3), "La suma de 2 y 3 debe ser 5");
        assertEquals(10, sumador.sumar(5, 5), "La suma de 5 y 5 debe ser 10");
        assertEquals(0, sumador.sumar(-1, 1), "La suma de -1 y 1 debe ser 0");
    }
}