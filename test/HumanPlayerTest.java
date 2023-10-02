import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class HumanPlayerTest {

    private HumanPlayer humanPlayer;

    @BeforeEach
    public void setUp() {
        humanPlayer = new HumanPlayer();
    }

    @AfterEach
    public void tearDown() {
        humanPlayer = null;
    }

    @Test
    public void testMakeGuessInvalid() {
        String input = "abc\n7\n"; // Input inválido seguido de input válido
        InputStream inputUser = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputUser); // utiliza la secuencia simulada en lugar de la entrada real.
        int guess = humanPlayer.makeGuess();

        assertEquals(7, guess); // indicamos que sea igual lo esperado con la simulación
    }
}