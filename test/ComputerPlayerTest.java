import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputerPlayerTest {
    @Test
    public void testMakeGuessRange() {
        ComputerPlayer computerPlayer = new ComputerPlayer();
        int guess = computerPlayer.makeGuess();
        assertTrue(guess >= 1 && guess <= 100, "El número debe estar en el rango de 1 a 100");
    }
}