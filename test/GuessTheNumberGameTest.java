import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class GuessTheNumberGameTest {
    @Test
    public void testCheckGuessCorrect() {
        int targetNumber = 42; // Suponiendo que el número objetivo es 42
        String input = "42\n"; //entrada simulada del usuario
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        GuessTheNumberGame.checkGuess(targetNumber);

        String output = out.toString().trim(); // Obtiene la salida del juego sin espacios

        assertEquals("¡¡Felicitaciones!! Acertaste", output, "El juego debería felicitar al jugador por adivinar correctamente");
    }

    }